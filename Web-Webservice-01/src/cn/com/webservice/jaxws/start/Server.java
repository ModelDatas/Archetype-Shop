/**
 * 
 */
package cn.com.webservice.jaxws.start;

import javax.xml.ws.Endpoint;

import cn.com.webservice.jaxws.server.Impl.WeatherInterfaceImpl;

/**
 * @author  creator
 * @date    2018年1月9日:下午5:39:54
 * <p>describe: 打开服务</p>
 * @version 1.0.0
 */
public class Server {

	/**
	 * @autor   creator
	 * @date    2018年1月9日:下午5:39:54
	 * @main:Server
	 * <p>describe:</p>
	 * @version 1.0.0
	 * @param args
	 */
	public static void main(String[] args) {

		Endpoint.publish("http://127.0.0.1:6789/weather",
				new WeatherInterfaceImpl());
		System.out.println("发布server");
	}

}
