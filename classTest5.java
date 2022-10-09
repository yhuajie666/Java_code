
public class classTest5 {
	public static void main(String[] args) {
		Customer cust=new Customer("Jane","Smith");
		Account acct=new Account(1000,2000,0.0123);
		cust.setAccount(acct);
		cust.getAccount().deposite(100);
		cust.getAccount().deposite(960);
		cust.getAccount().withdraw(2000);
		cust.getFirstName();
		cust.getLastName();
		cust.getAccount();
		System.out.println("Customer["+cust.getLastName()+","+cust.getFirstName()+"]"+
		"has a account:id is "+cust.getAccount().getId()+",annualinterestRate is "+
				cust.getAccount().getAnnualinterestRate()*100+"%,balance is "+cust.getAccount().getBalance());
	}
}


class Account{
	private int id;//账号
	private double balance;//余额
	private double annualinterestRate;//年利率
	public Account(int id, double balance, double annualinterestRate) {
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
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualinterestRate() {
		return annualinterestRate;
	}
	public void setAnnualinterestRate(double annualinterestRate) {
		this.annualinterestRate = annualinterestRate;
	}
	public void withdraw(double amount) {//取钱
		if(balance<amount) {
			System.out.println("余额不足，取钱失败！");
		}else {
			balance-=amount;
			System.out.println("成功取出:"+amount);
		}
	}
	public void deposite(double amount) {//存钱
		if(amount>0) {
			balance+=amount;
			System.out.println("成功存入:"+amount);
		}
	}
	
	
}


class Customer{
	private String firstName;
	private String lastName;
	private Account account;//账户
	public Customer(String f,String l) {
		firstName=f;
		lastName=l;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account=account;
	}
	
}
