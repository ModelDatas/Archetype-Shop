package com.archetype.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import com.archetype.commom.utils.FtpUtil;

public class FtpTest {
	
	@Test
	public void testFtpClient() throws SocketException, IOException {
		
		//创建一个ftp客户端
		FTPClient ftpClient= new FTPClient();
		//创建一个ftp连接
		ftpClient.connect("192.168.230.130" , 21);
		//用户名和密码登录
		ftpClient.login("ftpuser", "qaz000OKM");
		//输入文件流
		FileInputStream fStream = new FileInputStream("C:\\Users\\CKM-KING\\Pictures\\1.jpg");
		//服务器的上传路径
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		//设置文件格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//上传
		ftpClient.storeFile("test.jpg", fStream);
		//关闭连接
		ftpClient.logout();
	}
	
	@Test
	public void testFtpUtiles() throws FileNotFoundException{
		FileInputStream fStream = new FileInputStream("C:\\Users\\CKM-KING\\Pictures\\2.jpg");
		FtpUtil.uploadFile("192.168.230.130", 21, "ftpuser", "qaz000OKM", "/home/ftpuser/www/images", "/2017/11/28", "girl.jpg", fStream);
	}
}
