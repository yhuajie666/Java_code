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
			System.out.println("成功存入:"+amt);
		}
	}
	
	public void withdraw(double amt) {
		if(balance<amt) {
			System.out.println("余额不足,取钱失败!");
			return;
		}
		balance-=amt;
		System.out.println("成功取出:"+amt);
	}
}
