package PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JDBCUtils;

public class PreparedStatementUpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//1.获取数据库的连接
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn = JDBCUtils.getConnection();
			//2.预编译sql语句，返回PreparedStatement的实例
			String sql="update user1 set user=? where id=?";
			ps = conn.prepareStatement(sql);
			//3.填充占位符
			ps.setString(1, "SS");
			ps.setString(2, "8");
			//4.执行
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//5.关闭资源
			JDBCUtils.closeResources(conn, ps);
		}
		
	}
	/*
	 * 增删改操作
	 */
	public void update(String sql,Object ...args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			
			for(int i=0;i<args.length;i++) {
				ps.setObject(i+1, args[i]);
			}
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.closeResources(conn, ps);
		}
		
	}

}
