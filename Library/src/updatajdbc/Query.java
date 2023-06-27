package updatajdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ListClass.book;
import ListClass.student;
import util.JDBCUtils;

public class Query {
	
	public void query()  {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn = JDBCUtils.getConnection();
			
			String sql="select * from book";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();//执行SELECT语句
			while(rs.next()) {
				int id=rs.getInt(1);
				String title=rs.getString(2);
				String writer=rs.getString(3);
				String press=rs.getString(4);
				Date date=rs.getDate(5);
				String state=rs.getString(6);
				
				book book = new book(id,title,writer,press,date,state);
				System.out.println(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.closeResources(conn, ps, rs);
		}
		
	}
	
	public void queryStudent()  {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn = JDBCUtils.getConnection();
			
			String sql="select * from student";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String number=rs.getString(3);
				String sex=rs.getString(4);
				String grade=rs.getString(5);
				
				student stu = new student(id,name,number,sex,grade);
				System.out.println(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.closeResources(conn, ps, rs);
		}
		
	}
	
}
