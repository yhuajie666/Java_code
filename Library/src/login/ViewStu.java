package login;

import java.util.Scanner;

import updatajdbc.insert;

public class ViewStu {
	
	Scanner sc=new Scanner(System.in);
	public void ViewStudent() {
		
		
		System.out.println("****************************************");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("*          欢迎进入学生管理页面                    *");
		System.out.println("*                                      *");
		System.out.println("*                                      *");
		System.out.println("****************************************");
		System.out.println("*     1.借阅书籍             2.归还书籍                 *");
		System.out.println();
		System.out.println("*            3.返回上一级                                *");
		System.out.println("****************************************");
		
		
		int count=0;
		while(count!=3) {
			System.out.println("请输入你的服务：");
			count=sc.nextInt();
			switch (count) {
			case 1:
				Borrow();
				System.out.println("借阅成功!");
				break;
			case 2:
				Return();
				System.out.println("归还成功!");
				break;
			case 3:
				Admin admin = new Admin();
				admin.viewAdmin();
				break;

			default:
				break;
			}
			ViewStudent();
		}
	}
	
	public void Borrow() {
		System.out.println("请输入书名：");
		String title = sc.next();

		String sql="update book set state=? where title=?";
		insert is = new insert();
		is.insert(sql, "已借出",title);
		
	}
	
	public void Return() {
		System.out.println("请输入书名：");
		String title = sc.next();

		String sql="update book set state=? where title=?";
		insert is = new insert();
		is.insert(sql, "未借出",title);
	}
	
}
	

