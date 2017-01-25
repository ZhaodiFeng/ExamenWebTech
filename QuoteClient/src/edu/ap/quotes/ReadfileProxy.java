package edu.ap.quotes;

public class ReadfileProxy implements edu.ap.quotes.Readfile {
  private String _endpoint = null;
  private edu.ap.quotes.Readfile readfile = null;
  
  public ReadfileProxy() {
    _initReadfileProxy();
  }
  
  public ReadfileProxy(String endpoint) {
    _endpoint = endpoint;
    _initReadfileProxy();
  }
  
  private void _initReadfileProxy() {
    try {
      readfile = (new edu.ap.quotes.ReadfileServiceLocator()).getReadfile();
      if (readfile != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)readfile)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)readfile)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (readfile != null)
      ((javax.xml.rpc.Stub)readfile)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.ap.quotes.Readfile getReadfile() {
    if (readfile == null)
      _initReadfileProxy();
    return readfile;
  }
  
  public java.lang.String[] getQuotes(java.lang.String word) throws java.rmi.RemoteException{
    if (readfile == null)
      _initReadfileProxy();
    return readfile.getQuotes(word);
  }
  
  public java.lang.String[] getAllQuotes() throws java.rmi.RemoteException{
    if (readfile == null)
      _initReadfileProxy();
    return readfile.getAllQuotes();
  }
  
  
}