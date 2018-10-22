
package com.haotu369.webservice.wsimport.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WorkFlowServiceService", targetNamespace = "http://service.wsimport.webservice.haotu369.com/", wsdlLocation = "http://127.0.0.1:9081/service/workflow?wsdl")
public class WorkFlowServiceService
    extends Service
{

    private final static URL WORKFLOWSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException WORKFLOWSERVICESERVICE_EXCEPTION;
    private final static QName WORKFLOWSERVICESERVICE_QNAME = new QName("http://service.wsimport.webservice.haotu369.com/", "WorkFlowServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:9081/service/workflow?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WORKFLOWSERVICESERVICE_WSDL_LOCATION = url;
        WORKFLOWSERVICESERVICE_EXCEPTION = e;
    }

    public WorkFlowServiceService() {
        super(__getWsdlLocation(), WORKFLOWSERVICESERVICE_QNAME);
    }

    public WorkFlowServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WORKFLOWSERVICESERVICE_QNAME, features);
    }

    public WorkFlowServiceService(URL wsdlLocation) {
        super(wsdlLocation, WORKFLOWSERVICESERVICE_QNAME);
    }

    public WorkFlowServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WORKFLOWSERVICESERVICE_QNAME, features);
    }

    public WorkFlowServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WorkFlowServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WorkFlowService
     */
    @WebEndpoint(name = "WorkFlowServicePort")
    public WorkFlowService getWorkFlowServicePort() {
        return super.getPort(new QName("http://service.wsimport.webservice.haotu369.com/", "WorkFlowServicePort"), WorkFlowService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WorkFlowService
     */
    @WebEndpoint(name = "WorkFlowServicePort")
    public WorkFlowService getWorkFlowServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.wsimport.webservice.haotu369.com/", "WorkFlowServicePort"), WorkFlowService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WORKFLOWSERVICESERVICE_EXCEPTION!= null) {
            throw WORKFLOWSERVICESERVICE_EXCEPTION;
        }
        return WORKFLOWSERVICESERVICE_WSDL_LOCATION;
    }

}