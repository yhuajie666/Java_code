package Connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver driver=new com.mysql.jdbc.Driver();
		String url="jdbc:mysql://localhost:3306/test";
		Properties info=new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "2002");
		Connection conn=driver.connect(url, info);
		System.out.println(conn);
		
	}

}
