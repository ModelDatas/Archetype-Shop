/**
 * 
 */
package cn.com.webservice.jaxws.server;

/**
 * @author  creator
 * @date    2018年1月9日:下午5:21:06
 * <p>describe: 天气查询服务接口</p>
 * @version 1.0.0
 */
public interface WeatherInterface {
	/**
	 * @autor   creator
	 * @date    2018年1月9日:下午5:29:57
	 * @queryWeather:WeatherInterface
	 * <p>describe: 接收客户端发来的城市信息,返回天气信息</p>
	 * @version 1.0.0
	 * @param cityName
	 * @return 返回给客户端天气
	 */
	String queryWeather(String cityName);
}
