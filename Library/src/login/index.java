package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import ListClass.register;
import util.JDBCUtils;

public class index{
	
	Scanner sc=new Scanner(System.in);

	public void indexView() {
		
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*          欢迎进入图书管理系统                      *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		System.out.println("*    1.登录     2.注册    3.退出             *");
		System.out.println("****************************************");
		
		
		int count=0;
		while(count!=3) {
			System.out.println("请输入你的服务：");
			count=sc.nextInt();
			switch (count) {
			case 1:
				
				login();
				break;
			case 2:
				System.out.println("请输入用户名:");
				String user = sc.next();
				System.out.println("请输入密码:");
				String password = sc.next();
				
				register register = new register();
				register.setUser(user);
				register.setPassword(password);
				register(register);
				break;
			case 3:
				System.out.println("退出图书管理系统!");
				System.exit(1);//退出
				break;

			default:
				System.out.println("请重新输入！");
				index index = new index();
				index.indexView();
				break;
			}
		}
		
		
	}
	/**
	 * 用户登录
	 * @throws Exception 
	 */
	public void login() {
		System.out.println("请输入用户名:");
		String user = sc.next();
		System.out.println("请输入密码:");
		String password = sc.next();
		boolean flag=false;
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn = JDBCUtils.getConnection();
			String sql="select * from register where user=? and password=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			if(rs.next())
			{
				flag=true;
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
		
		
		if(flag) {
			System.out.println("登陆成功!");
			Admin admin = new Admin();
			admin.viewAdmin();
		}else {
			System.out.println("你输入的用户名或密码错误!");
		}
		
		
	}
	/**
	 * 用户注册
	 * 
	 */
	public void register(register register) {
		
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn = JDBCUtils.getConnection();
			
			String sql="insert into register(user,password)values(?,?)";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, register.getUser());
			ps.setString(2, register.getPassword());
			
			ps.execute();
			System.out.println("执行成功!");
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
