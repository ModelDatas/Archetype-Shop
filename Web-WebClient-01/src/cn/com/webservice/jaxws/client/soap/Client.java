/**
 * 
 */
package cn.com.webservice.jaxws.client.soap;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import cn.com.webservice.jaxws.server.impl.WeatherInterfaceImpl;

/**
 * @author  creator
 * @date    2018年1月11日:下午1:13:45
 * <p>describe:</p>
 * @version 1.0.0
 */
public class Client {
	
	
	public void getmain(String str) {
		
		try {
			//创建服务地址的连接
			URL url = new URL("http://127.0.0.1:6789/weather?wsdl");
			//定义qname,第一个参数是命名空间,第二个参数名称是wsdl里边的服务名
			QName qName = new QName("http://Impl.server.jaxws.webservice.com.cn/", "WeatherInterfaceImplService");
			//创建服务视图
			Service service = Service.create(url,qName);
			//得到服务端点
			WeatherInterfaceImpl weatherInterfaceImpl = service.getPort(WeatherInterfaceImpl.class);
			String query = weatherInterfaceImpl.queryWeather("北京"+str);
			System.out.println(query);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void getTest() {
		Client client = new Client();
		client.getmain("成都");
	}
	
}
