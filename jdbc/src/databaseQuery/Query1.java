package databaseQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtils;

public class Query1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet resultset=null;
		try {
			conn = JDBCUtils.getConnection();
			String sql="select id,user,password,balance from user1 where id=?";
			ps = conn.prepareStatement(sql);
			ps.setObject(1, 1);
			resultset = ps.executeQuery();
			
			if(resultset.next()) {
				int id=resultset.getInt(1);
				String user=resultset.getString(2);
				String password=resultset.getString(3);
				String balance=resultset.getString(4);
				
				//将数据封装为一个对象
				user1 u1=new user1(id,user,password,balance);
				System.out.println(u1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.closeResources(conn, ps,resultset);
		}
		
		
		
		
		
	}

}
