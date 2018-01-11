/**
 * 
 */
package cn.com.webservice.socketclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author  creator
 * @date    2018年1月9日:下午4:41:35
 * <p>describe:</p>
 * @version 1.0.0
 */
public class SocketClient {

	/**
	 * @autor   creator
	 * @date    2018年1月9日:下午4:41:35
	 * @main:SocketClient
	 * <p>describe:</p>
	 * @version 1.0.0
	 * @param args
	 */
	public static void main(String[] args) {
		
		Socket socket =null;
		DataOutputStream dataOutputStream =null;
		DataInputStream dataInputStream =null;
		try {
			
			//创建socket连接
			socket = new Socket("192.168.56.1",1234);
			
			//得到输出流,发送数据
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
		
			//发送给服务端城市信息
			String cityName = "北京";
			dataOutputStream.writeUTF(cityName);
			System.out.println("push to server" + cityName);
			
			//得到输入流,接收数据,server的天气信息
			dataInputStream = new DataInputStream(socket.getInputStream());
			String result = dataInputStream.readUTF();
			System.out.println("accept server information " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) {
					socket.close();
				}
				if(dataOutputStream != null) {
					dataOutputStream.close();
				}
				if(dataInputStream != null) {
					dataInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
