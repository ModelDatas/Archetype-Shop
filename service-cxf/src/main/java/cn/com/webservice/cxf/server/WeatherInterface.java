package cn.com.webservice.cxf.server;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {
	String getWeatherResult(String args);
}
