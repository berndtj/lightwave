pipeline {
    agent any
    environment {
        DEFAULT_AWS_REGION = 'us-west-2'
        TOOLCHAIN_REPO = '367199020685.dkr.ecr.us-west-2.amazonaws.com/lightwave-toolchain'
        DOCKER_API_VERSION = '1.23'
    }
    stages {
        stage("build toolchain") {
            steps {
                sh "aws ecr get-login --region ${env.DEFAULT_AWS_REGION} | sh"
                // Need scripted pipeline for try/catch
                script {
                    try {
                        sh "docker pull ${env.TOOLCHAIN_REPO}"
                    } catch (error) {
                        echo "existing image not found... continue to build toolchain"
                    }
                }
                sh "docker build -t ${env.TOOLCHAIN_REPO}:${env.BUILD_ID} -t ${env.TOOLCHAIN_REPO}:latest support/developer/buildenv"
                sh "push_ecs.sh ${env.TOOLCHAIN_REPO}:latest"
            }
        }
        stage("build lightwave rpms") {
            steps {
                withDockerContainer(image: "${env.TOOLCHAIN_REPO}:${env.BUILD_ID}") {
                    sh "make"
                }
                archiveArtifacts artifacts: 'stage/**/*.rpm'
            }
        }
        stage("build lightwave ami") {
            steps {
                withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: 'aws-jenkins', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
                    sh """
                        cd appliance
                        MAC=`curl -s http://169.254.169.254/latest/meta-data/network/interfaces/macs/ | cut -d'/' -f 1`
                        VPC_ID=`curl http://169.254.169.254/latest/meta-data/network/interfaces/macs/\$MAC/vpc-id`
                        SUBNET_ID=`curl http://169.254.169.254/latest/meta-data/network/interfaces/macs/\$MAC/subnet-id`
                        packer build -force -only=amazon-ebs -var "aws_region=${env.DEFAULT_AWS_REGION}" -var "aws_vpc_id=\$VPC_ID" -var "aws_subnet_id=\$SUBNET_ID" lightwave-packer.json
                    """
                }
            }
        }
    }
}