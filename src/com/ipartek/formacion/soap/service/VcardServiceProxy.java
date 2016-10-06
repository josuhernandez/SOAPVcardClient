package com.ipartek.formacion.soap.service;

public class VcardServiceProxy implements com.ipartek.formacion.soap.service.VcardService {
  private String _endpoint = null;
  private com.ipartek.formacion.soap.service.VcardService vcardService = null;
  
  public VcardServiceProxy() {
    _initVcardServiceProxy();
  }
  
  public VcardServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initVcardServiceProxy();
  }
  
  private void _initVcardServiceProxy() {
    try {
      vcardService = (new com.ipartek.formacion.soap.service.VcardServiceServiceLocator()).getVcardService();
      if (vcardService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)vcardService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)vcardService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (vcardService != null)
      ((javax.xml.rpc.Stub)vcardService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ipartek.formacion.soap.service.VcardService getVcardService() {
    if (vcardService == null)
      _initVcardServiceProxy();
    return vcardService;
  }
  
  public com.ipartek.formacion.soap.Empleado getVcard(java.lang.String usuario, java.lang.String password, int id_empleado) throws java.rmi.RemoteException{
    if (vcardService == null)
      _initVcardServiceProxy();
    return vcardService.getVcard(usuario, password, id_empleado);
  }
  
  
}