FROM vmware/photon:1.0
MAINTAINER "Sriram Nambakam" <snambakam@vmware.com>
ENV container=docker

# setup tools required for development
RUN tdnf update -y tdnf \
        rpm && \
    tdnf install -y procps-ng-3.3.11-4.ph1 \
        binutils-2.25.1-4.ph1 \
        git-2.8.1-5.ph1 \
        make-4.1-3.ph1 \
        gawk-4.1.3-2.ph1 \
        autoconf-2.69-4.ph1 \
        automake-1.15-2.ph1 \
        libtool-2.4.6-2.ph1 \
        gcc-5.3.0-3.ph1 \
        glibc-devel-2.22-10.ph1 \
        linux-api-headers-4.4.67-1.ph1 \
        util-linux-devel-2.27.1-3.ph1 \
        e2fsprogs-devel-1.42.13-2.ph1 \
        rpm-build-4.11.2-12.ph1 \
        rpm-devel-4.11.2-12.ph1 \
        openjdk-1.8.0.112-1.ph1 \
        apache-maven-3.3.9-7.ph1 \
        apache-ant-1.9.6-5.ph1 \
        ant-contrib-1.0b3-10.ph1 \
        jaxws-ri-2.2.10-2.ph1 \
        python2-devel-2.7.13-2.ph1 \
        apache-tomcat-8.5.13-2.ph1 \
        boost-devel-1.60.0-2.ph1 \
        openssl-devel-1.0.2k-1.ph1 \
        likewise-open-devel-6.2.11-1 \
        jansson-devel-2.9-1.ph1 \
        elfutils-0.165-2.ph1;

env PATH /var/opt/OpenJDK-1.8.0.112-bin/bin:$PATH

EXPOSE 22

ENTRYPOINT ["/bin/bash"]
