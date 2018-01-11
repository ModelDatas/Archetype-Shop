/**
 * 
 */
package cn.com.webservice.socketservice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author  creator
 * @date    2018年1月9日:下午4:03:26
 * <p>describe: 服务端接口</p>
 * @version 1.0.0
 */
public class SocketService {

	/**
	 * @autor   creator
	 * @date    2018年1月9日:下午4:03:26
	 * @main:SocketService
	 * <p>describe:</p>
	 * @version 1.0.0
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//启动socket服务端
		ServerSocket serverSocket = new ServerSocket(1234);
		DataInputStream dataInputStream =null;
		DataOutputStream dataOutputStream = null;
		System.out.println("server start");
		
		while(true) {
			try {
				
				//监听客户端连接
				//accept方法是阻塞方法
				Socket socket = serverSocket.accept();
				
				//得到输入流,从此流获得数据
				dataInputStream = new DataInputStream(socket.getInputStream());
				
				//得到输出流,从此流传输数据
				dataOutputStream = new DataOutputStream(socket.getOutputStream());
				
				//城市名称
				String cityName = dataInputStream.readUTF();
				System.out.println("from client.."+cityName);
				
				//查询天气
				String result = "晴";
				//将天气结果传输给客户端
				dataOutputStream.writeUTF(result);
				System.out.println("push to client information" + result);
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(dataInputStream != null) {
					dataInputStream.close();
				}
				if (dataOutputStream != null) {
					dataOutputStream.close();
				}
				
			}
			
		}
		
		
	}

}
