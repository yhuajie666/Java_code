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
			System.out.println("ȡǮ�ɹ���");
		}else {
			System.out.println("ȡǮʧ�ܣ�");
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



class Bank{
	private Customer[] customers;//��Ŷ���ͻ�������
	private int numberCustomers;//��¼�ͻ��ĸ���
	public Bank() {
		customers=new Customer[10];
	}
	//��ӿͻ�
	public void addCustomer(String f,String l) {
		Customer cust=new Customer(f,l);
		customers[numberCustomers]=cust;
		numberCustomers++;
	}
	//��ȡ�ͻ��ĸ���
	public int getNumberCustomers() {
		return numberCustomers;
	}
	//��ȡָ��λ�õĿͻ�
	public Customer getCustomer(int index) {
		//return customers[index];���ܱ��쳣
		if(index>=0&&index<numberCustomers) {
			return customers[index];
		}
		return null;
	}
}
