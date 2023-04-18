package databaseQuery;
/*
 * ORM编程思想（object relational mapping）
 * 一个数据表对应一个Java类
 * 表中一条记录对应Java类的一个对象
 * 表中的一个字段对应Java类的一个属性
 */
public class user1 {
	private int id;
	private String user;
	private String password;
	private String balance;
	public user1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public user1(int id, String user, String password, String balance) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "user1 [id=" + id + ", user=" + user + ", password=" + password + ", balance=" + balance + "]";
	}
	
	
	
	
}
