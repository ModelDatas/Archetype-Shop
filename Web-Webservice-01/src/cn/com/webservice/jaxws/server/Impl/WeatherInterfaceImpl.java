package cn.com.webservice.jaxws.server.Impl;

import javax.jws.WebService;

import cn.com.webservice.jaxws.server.WeatherInterface;

/**
 * @author  creator
 * @date    2018年1月9日:下午5:27:07
 * <p>describe: 天气查询服务接口(实现)</p>
 * @version 1.0.0
 */
@WebService
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		
		System.out.println("from client information " + cityName);
		return cityName + "小雨转晴";
	}

}
