/**
 * 
 */
package cn.com.webservice.jaxws.client;

import cn.com.webservice.jaxws.server.impl.WeatherInterfaceImpl;
import cn.com.webservice.jaxws.server.impl.WeatherInterfaceImplService;

/**
 * @author  creator
 * @date    2018年1月9日:下午6:14:37
 * <p>describe:</p>
 * @version 1.0.0
 */
public class Client {

	/**
	 * @autor   creator
	 * @date    2018年1月9日:下午6:14:37
	 * @main:Client
	 * <p>describe:</p>
	 * @version 1.0.0
	 * @param args
	 */
	public static void main(String[] args) {
		
		//创建weservice的服务视图
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
		//通过视图得到服务端点
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getWeatherInterfaceImplPort();
		//通过服务端调用webservice
		//向服务端发送数据(北京)
		String result = weatherInterfaceImpl.queryWeather("北京");
		System.out.println("from server .." + result);
		
	}

}
