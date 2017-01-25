/**
 * Readfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.ap.quotes;

public interface Readfile extends java.rmi.Remote {
    public java.lang.String[] getQuotes(java.lang.String word) throws java.rmi.RemoteException;
    public java.lang.String[] getAllQuotes() throws java.rmi.RemoteException;
}
