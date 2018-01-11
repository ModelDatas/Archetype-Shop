package cn.com.webservice.cxf.server;

public class WeatherInterfaceProxy implements cn.com.webservice.cxf.server.WeatherInterface {
  private String _endpoint = null;
  private cn.com.webservice.cxf.server.WeatherInterface weatherInterface = null;
  
  public WeatherInterfaceProxy() {
    _initWeatherInterfaceProxy();
  }
  
  public WeatherInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWeatherInterfaceProxy();
  }
  
  private void _initWeatherInterfaceProxy() {
    try {
      weatherInterface = (new cn.com.webservice.cxf.server.WeatherInterfaceServiceLocator()).getWeatherInterfacePort();
      if (weatherInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)weatherInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)weatherInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (weatherInterface != null)
      ((javax.xml.rpc.Stub)weatherInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.webservice.cxf.server.WeatherInterface getWeatherInterface() {
    if (weatherInterface == null)
      _initWeatherInterfaceProxy();
    return weatherInterface;
  }
  
  public java.lang.String getWeatherResult(java.lang.String arg0) throws java.rmi.RemoteException{
    if (weatherInterface == null)
      _initWeatherInterfaceProxy();
    return weatherInterface.getWeatherResult(arg0);
  }
  
  
}