package util;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


public class JDBCUtils {
	
		public static Connection getConnection() throws Exception {
			//1.读取配置文件中的4个基本信息
			InputStream is=ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
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
			return conn;
		}
		
		//关闭资源
		public static void closeResources(Connection conn,PreparedStatement ps) {
			try {
				if(ps!=null)
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn!=null)
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		public static void closeResources(Connection conn,PreparedStatement ps,ResultSet rs) {
			try {
				if(ps!=null)
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn!=null)
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(rs!=null)
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

