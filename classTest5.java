
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
	private int id;//�˺�
	private double balance;//���
	private double annualinterestRate;//������
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
	public void withdraw(double amount) {//ȡǮ
		if(balance<amount) {
			System.out.println("���㣬ȡǮʧ�ܣ�");
		}else {
			balance-=amount;
			System.out.println("�ɹ�ȡ��:"+amount);
		}
	}
	public void deposite(double amount) {//��Ǯ
		if(amount>0) {
			balance+=amount;
			System.out.println("�ɹ�����:"+amount);
		}
	}
	
	
}


class Customer{
	private String firstName;
	private String lastName;
	private Account account;//�˻�
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
