/**
 * WeatherInterfaceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.webservice.cxf.server;

public interface WeatherInterfaceService extends javax.xml.rpc.Service {
    public java.lang.String getWeatherInterfacePortAddress();

    public cn.com.webservice.cxf.server.WeatherInterface getWeatherInterfacePort() throws javax.xml.rpc.ServiceException;

    public cn.com.webservice.cxf.server.WeatherInterface getWeatherInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
