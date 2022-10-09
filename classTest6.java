package exercise1;

public class classTest6 {
	public static void main(String[] args) {
		Bank bank=new Bank();
		
		bank.addCustomer("Jane", "amith");
		bank.getCustomer(0).setAccount(new Account(2000));
		
	}
}

class Account{
	private double balance;
	public Account(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println(" ");
		}
	}
	public void withdraw(double amt) {
		if(balance>=amt) {
			balance-=amt;
			System.out.println("取钱成功！");
		}else {
			System.out.println("取钱失败！");
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



class Bank{
	private Customer[] customers;//存放多个客户的数组
	private int numberCustomers;//记录客户的个数
	public Bank() {
		customers=new Customer[10];
	}
	//添加客户
	public void addCustomer(String f,String l) {
		Customer cust=new Customer(f,l);
		customers[numberCustomers]=cust;
		numberCustomers++;
	}
	//获取客户的个数
	public int getNumberCustomers() {
		return numberCustomers;
	}
	//获取指定位置的客户
	public Customer getCustomer(int index) {
		//return customers[index];可能报异常
		if(index>=0&&index<numberCustomers) {
			return customers[index];
		}
		return null;
	}
}
