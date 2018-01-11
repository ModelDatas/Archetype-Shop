/**
 * WeatherInterfaceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.webservice.cxf.server;

public class WeatherInterfaceServiceLocator extends org.apache.axis.client.Service implements cn.com.webservice.cxf.server.WeatherInterfaceService {

    public WeatherInterfaceServiceLocator() {
    }


    public WeatherInterfaceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherInterfaceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherInterfacePort
    private java.lang.String WeatherInterfacePort_address = "http://127.0.0.1:8080/service-cxf/services/weather";

    public java.lang.String getWeatherInterfacePortAddress() {
        return WeatherInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherInterfacePortWSDDServiceName = "WeatherInterfacePort";

    public java.lang.String getWeatherInterfacePortWSDDServiceName() {
        return WeatherInterfacePortWSDDServiceName;
    }

    public void setWeatherInterfacePortWSDDServiceName(java.lang.String name) {
        WeatherInterfacePortWSDDServiceName = name;
    }

    public cn.com.webservice.cxf.server.WeatherInterface getWeatherInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherInterfacePort(endpoint);
    }

    public cn.com.webservice.cxf.server.WeatherInterface getWeatherInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.webservice.cxf.server.WeatherInterfaceServiceSoapBindingStub _stub = new cn.com.webservice.cxf.server.WeatherInterfaceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWeatherInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherInterfacePortEndpointAddress(java.lang.String address) {
        WeatherInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.webservice.cxf.server.WeatherInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.webservice.cxf.server.WeatherInterfaceServiceSoapBindingStub _stub = new cn.com.webservice.cxf.server.WeatherInterfaceServiceSoapBindingStub(new java.net.URL(WeatherInterfacePort_address), this);
                _stub.setPortName(getWeatherInterfacePortWSDDServiceName());
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
        if ("WeatherInterfacePort".equals(inputPortName)) {
            return getWeatherInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.cxf.webservice.com.cn/", "WeatherInterfaceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.cxf.webservice.com.cn/", "WeatherInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherInterfacePort".equals(portName)) {
            setWeatherInterfacePortEndpointAddress(address);
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
