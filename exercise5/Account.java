package exercise5;

public class Account {
	private int id;
	private double balance;
	private double annouallnterestRate;
	
	public Account(int id, double balance, double annouallnterestRate) {
		this.id = id;
		this.balance = balance;
		this.annouallnterestRate = annouallnterestRate;
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

	public double getAnnouallnterestRate() {
		return annouallnterestRate;
	}

	public void setAnnouallnterestRate(double annouallnterestRate) {
		this.annouallnterestRate = annouallnterestRate;
	}
	
	public double getMonthlyinterest() {
		return annouallnterestRate/12;
	}
	
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("余额不足,取钱失败!");
			return;
		}else {
			balance-=amount;
			System.out.println("成功取出"+amount);
		}
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("成功存入"+amount);
		}
	}
}
