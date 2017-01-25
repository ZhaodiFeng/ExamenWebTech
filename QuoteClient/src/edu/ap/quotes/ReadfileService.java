/**
 * ReadfileService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.ap.quotes;

public interface ReadfileService extends javax.xml.rpc.Service {
    public java.lang.String getReadfileAddress();

    public edu.ap.quotes.Readfile getReadfile() throws javax.xml.rpc.ServiceException;

    public edu.ap.quotes.Readfile getReadfile(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
