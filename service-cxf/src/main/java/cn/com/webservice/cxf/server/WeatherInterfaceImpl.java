/**
 * 
 */
package cn.com.webservice.cxf.server;

/**
 * @author  creator
 * @date    2018年1月10日:下午5:02:34
 * <p>describe:</p>
 * @version 1.0.0
 */
public class WeatherInterfaceImpl implements WeatherInterface {

	public String getWeatherResult(String args) {
		System.err.println(args);
		
		return "小雨转晴";
	}
	
}
