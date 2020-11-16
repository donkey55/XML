/**
 * QueryServerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public class QueryServerServiceLocator extends org.apache.axis.client.Service implements client.QueryServerService {

    public QueryServerServiceLocator() {
    }


    public QueryServerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryServerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QueryServer
    private java.lang.String QueryServer_address = "http://localhost:8080//services/foo/QueryServer";

    public java.lang.String getQueryServerAddress() {
        return QueryServer_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QueryServerWSDDServiceName = "QueryServer";

    public java.lang.String getQueryServerWSDDServiceName() {
        return QueryServerWSDDServiceName;
    }

    public void setQueryServerWSDDServiceName(java.lang.String name) {
        QueryServerWSDDServiceName = name;
    }

    public client.QueryServer_PortType getQueryServer() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QueryServer_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQueryServer(endpoint);
    }

    public client.QueryServer_PortType getQueryServer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            client.QueryServerSoapBindingStub _stub = new client.QueryServerSoapBindingStub(portAddress, this);
            _stub.setPortName(getQueryServerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQueryServerEndpointAddress(java.lang.String address) {
        QueryServer_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (client.QueryServer_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                client.QueryServerSoapBindingStub _stub = new client.QueryServerSoapBindingStub(new java.net.URL(QueryServer_address), this);
                _stub.setPortName(getQueryServerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("QueryServer".equals(inputPortName)) {
            return getQueryServer();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://foo", "QueryServerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://foo", "QueryServer"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QueryServer".equals(portName)) {
            setQueryServerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
