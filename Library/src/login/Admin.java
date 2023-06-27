package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ListClass.student;
import updatajdbc.Query;
import updatajdbc.insert;
import util.JDBCUtils;

public class Admin{
	
	
	Scanner in=new Scanner(System.in);
	public void viewAdmin() {
		System.out.println("***********************************");
		System.out.println("*                                 *");
		System.out.println("*       欢迎进入图书管理员系统          *");
		System.out.println("*                                 *");
		System.out.println("***********************************");
		System.out.println("*        1.书籍列表                           *");
		System.out.println("*        2.录入书籍                                  *");
		System.out.println("*        3.查看学生信息                           *");
		System.out.println("*        4.返回上一级                               *");
		System.out.println("***********************************");
		System.out.println(" 请输入您需要的服务：");

		String index=in.nextLine();//读取文本框
		switch (index) {
		case "1":
			showList();
			break;
		case "2":
			update();
			System.out.println("录入成功!");
			break;
		case "3":
			showstudent();
			break;
		case "4":
			index view=new index();
			view.indexView();
			break;

		default:
			break;
		}
		viewAdmin();
	}
/**
 * 查看列表
 */
	public void showList() {
		Query qy = new Query();
		qy.query();	
	}
/**
* 录入书籍 
 * @throws Exception 
 */
	public void update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入书名：");
		String title = sc.next();
		System.out.println("请输入作者：");
		String writer = sc.next();
		System.out.println("请输入出版社：");
		String press = sc.next();
		System.out.println("请输入日期：");
		String date = sc.next();
		
		
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			conn = JDBCUtils.getConnection();
			String sql="insert into book(title,writer,press,date,state)values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);

			ps.setString(1, title);
			ps.setString(2, writer);
			ps.setString(3, press);
			//规定日期格式
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			java.util.Date udate=sdf.parse(date);
			long time = udate.getTime();
			java.sql.Date sqldate = new java.sql.Date(time);
			ps.setDate(4, sqldate);
			ps.setString(5, "未借出");
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.closeResources(conn, ps);
		}
		
		
		
		
	}
/**
 * 查询学生信息
 * @throws Exception 
 */
	public void showstudent() {
		
		Query qy = new Query();
		qy.queryStudent();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("输入需要查询的学号：");
		String number = sc.next();
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn = JDBCUtils.getConnection();
			String sql="select id,name,number,sex,grade from student where number=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, number);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String number1=rs.getString(3);
				String sex=rs.getString(4);
				String grade=rs.getString(5);
				
				student stu = new student(id,name,number1,sex,grade);
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
		
		
		ViewStu vs = new ViewStu();
		vs.ViewStudent();
	
	}

}

