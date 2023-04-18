package Connection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/*
 * 这种方法的好处？
 * 1.实现了数据与代码的分离，实现了解耦。
 * 2.如果需要修改配置文件信息，可以避免程序重新打包。
 */
public class ConnectionTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//1.读取配置文件中的4个基本信息
		InputStream is=ConnectionTest2.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties pros=new Properties();
		pros.load(is);
		String user=pros.getProperty("user");
		String password=pros.getProperty("password");
		String url=pros.getProperty("url");
		String driverClass=pros.getProperty("driverClass");
		
		//2.加载驱动
		Class.forName(driverClass);
		
		//3.获取链接
		Connection conn=DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}

}
