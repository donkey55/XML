/**
 * QueryServerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public interface QueryServerService extends javax.xml.rpc.Service {
    public java.lang.String getQueryServerAddress();

    public client.QueryServer_PortType getQueryServer() throws javax.xml.rpc.ServiceException;

    public client.QueryServer_PortType getQueryServer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
