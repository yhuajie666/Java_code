package Account.Bank;

public class Account {
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("�ɹ�����:"+amt);
		}
	}
	
	public void withdraw(double amt) {
		if(balance<amt) {
			System.out.println("����,ȡǮʧ��!");
			return;
		}
		balance-=amt;
		System.out.println("�ɹ�ȡ��:"+amt);
	}
}
