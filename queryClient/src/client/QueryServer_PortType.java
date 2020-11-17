/**
 * QueryServer_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public interface QueryServer_PortType extends java.rmi.Remote {
    public java.lang.String getMonthTemperature(java.lang.String yearAndMonth) throws java.rmi.RemoteException;
    public java.lang.String getDayTemperature(java.lang.String yearAndMonthAndDay) throws java.rmi.RemoteException;
    public java.lang.String getYearTemperature(java.lang.String year) throws java.rmi.RemoteException;
}
