package cn.com.webservice.cxf.client;

import java.rmi.RemoteException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.com.webservice.cxf.server.WeatherInterface;
import cn.com.webservice.cxf.server.WeatherInterfaceProxy;
import cn.com.webservice.cxf.server.WeatherInterfaceService;

public class Start {

	public static void main(String[] args) throws RemoteException {
		//创建weservice的服务视图
		WeatherInterfaceProxy weatherInterfaceProxy = new WeatherInterfaceProxy();
		String string = weatherInterfaceProxy.getWeatherResult("北京");
		System.out.println(string);
	}

}
