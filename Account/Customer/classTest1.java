package Account.Customer;

public class classTest1 {
	public static void main(String[] args) {
		Customer cust=new Customer("jane","smith");
		Account acct=new Account(1001,2000,0.0123);
		cust.setAccount(acct);
		cust.getAccount().deposit(1000);
		cust.getAccount().withdraw(500);
		System.out.println("balance="+cust.getAccount().getBalance());
	}
}

class Account{
	private int id;
	private double balance;
	private double annualinterestRate;
	public Account() {
		
	}
	public Account(int id, int balance, double annualinterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualinterestRate = annualinterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getAnnualinterestRate() {
		return annualinterestRate;
	}
	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
	}
	
	public void deposit(double amount) {//存钱
		if(amount>0) {
			balance+=amount;
			System.out.println("成功存入:"+amount);
		}
	}
	
	public void withdraw(double amount) {//取钱
		if(balance<amount) {
			System.out.println("余额不足,取钱失败!");
			return ;
		}
		balance-=amount;
		System.out.println("成功取出:"+amount);
	}
}

class Customer{
	private String firstname;//名
	private String surname;//姓
	private Account account;
	public Customer() {
	
	}
	
	public Customer(String firstname, String surname) {
		this.firstname = firstname;
		this.surname = surname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}