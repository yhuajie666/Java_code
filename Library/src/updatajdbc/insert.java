package updatajdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ListClass.register;
import util.JDBCUtils;

public class insert {
	
	public void insert(String sql,Object ...args) {
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
