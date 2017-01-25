/**
 * ReadfileServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.ap.quotes;

public class ReadfileServiceLocator extends org.apache.axis.client.Service implements edu.ap.quotes.ReadfileService {

    public ReadfileServiceLocator() {
    }


    public ReadfileServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReadfileServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Readfile
    private java.lang.String Readfile_address = "http://localhost:8080/QuoteService/services/Readfile";

    public java.lang.String getReadfileAddress() {
        return Readfile_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReadfileWSDDServiceName = "Readfile";

    public java.lang.String getReadfileWSDDServiceName() {
        return ReadfileWSDDServiceName;
    }

    public void setReadfileWSDDServiceName(java.lang.String name) {
        ReadfileWSDDServiceName = name;
    }

    public edu.ap.quotes.Readfile getReadfile() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Readfile_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReadfile(endpoint);
    }

    public edu.ap.quotes.Readfile getReadfile(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.ap.quotes.ReadfileSoapBindingStub _stub = new edu.ap.quotes.ReadfileSoapBindingStub(portAddress, this);
            _stub.setPortName(getReadfileWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReadfileEndpointAddress(java.lang.String address) {
        Readfile_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.ap.quotes.Readfile.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.ap.quotes.ReadfileSoapBindingStub _stub = new edu.ap.quotes.ReadfileSoapBindingStub(new java.net.URL(Readfile_address), this);
                _stub.setPortName(getReadfileWSDDServiceName());
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
        if ("Readfile".equals(inputPortName)) {
            return getReadfile();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://quotes.ap.edu", "ReadfileService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://quotes.ap.edu", "Readfile"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Readfile".equals(portName)) {
            setReadfileEndpointAddress(address);
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
