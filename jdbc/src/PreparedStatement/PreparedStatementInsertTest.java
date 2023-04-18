package PreparedStatement;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PreparedStatementInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.获取链接
		Connection conn=null;
		PreparedStatement ps=null;
		try {
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
					
					conn = DriverManager.getConnection(url, user, password);
					//4.预编译sql语句，返回PreparedStatement的实例
					String sql="insert into user1(user,password,balance)values(?,?,?)";
					ps = conn.prepareStatement(sql);
					//5.填充占位符
			
					ps.setString(1,"EE");
					ps.setString(2,"456");
					ps.setString(3,"5000");
					//6.执行sql
					ps.execute();
					System.out.println("执行成功!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//7.关闭资源
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
				
				
				
	}

}
