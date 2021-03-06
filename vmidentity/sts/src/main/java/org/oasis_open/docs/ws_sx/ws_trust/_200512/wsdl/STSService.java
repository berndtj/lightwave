
package org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseCollectionType;
import org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType;
import org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "STSService", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.rsa.names._2009._12.std_ext.saml2.ObjectFactory.class,
    com.rsa.names._2009._12.std_ext.ws_trust1_4.advice.ObjectFactory.class,
    oasis.names.tc.saml._2_0.assertion.ObjectFactory.class,
    oasis.names.tc.saml._2_0.conditions.delegation.ObjectFactory.class,
    org.oasis_open.docs.ws_sx.ws_trust._200512.ObjectFactory.class,
    org.oasis_open.docs.ws_sx.ws_trust._200802.ObjectFactory.class,
    org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.ObjectFactory.class,
    org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0.ObjectFactory.class,
    org.w3._2000._09.xmldsig_.ObjectFactory.class,
    org.w3._2005._08.addressing.ObjectFactory.class,
    com.rsa.names._2010._04.std_prof.saml2.ObjectFactory.class
})
public interface STSService {


    /**
     * 
     * @param requestSecurityTokenResponse
     * @return
     *     returns org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseCollectionType
     */
    @WebMethod(operationName = "Challenge", action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/Issue")
    @WebResult(name = "RequestSecurityTokenResponseCollection", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityTokenResponseCollection")
    public RequestSecurityTokenResponseCollectionType challenge(
        @WebParam(name = "RequestSecurityTokenResponse", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityTokenResponse")
        RequestSecurityTokenResponseType requestSecurityTokenResponse);

    /**
     * 
     * @param requestSecurityToken
     * @return
     *     returns org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseCollectionType
     */
    @WebMethod(operationName = "Issue", action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue")
    @WebResult(name = "RequestSecurityTokenResponseCollection", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityTokenResponseCollection")
    public RequestSecurityTokenResponseCollectionType issue(
        @WebParam(name = "RequestSecurityToken", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityToken")
        RequestSecurityTokenType requestSecurityToken);

    /**
     * 
     * @param requestSecurityToken
     * @return
     *     returns org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType
     */
    @WebMethod(operationName = "Renew", action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Renew")
    @WebResult(name = "RequestSecurityTokenResponse", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityTokenResponse")
    public RequestSecurityTokenResponseType renew(
        @WebParam(name = "RequestSecurityToken", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityToken")
        RequestSecurityTokenType requestSecurityToken);

    /**
     * 
     * @param requestSecurityToken
     * @return
     *     returns org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType
     */
    @WebMethod(operationName = "Validate", action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Validate")
    @WebResult(name = "RequestSecurityTokenResponse", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityTokenResponse")
    public RequestSecurityTokenResponseType validate(
        @WebParam(name = "RequestSecurityToken", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", partName = "RequestSecurityToken")
        RequestSecurityTokenType requestSecurityToken);

}
