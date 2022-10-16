package exercise5;

public class CheckAccount extends Account{
	private double overdraft;//可透支限额
	
	public CheckAccount(int id, double balance, double annouallnterestRate,double overdraft) {
		super(id, balance, annouallnterestRate);
		this.overdraft=overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}
	public void withdraw(double amount) {
		if(getBalance()>=amount) {
			super.withdraw(amount);
			
		}else if(overdraft>=amount-getBalance()) {
			overdraft-=(amount-getBalance());
			//setBalance(0);
			super.withdraw(getBalance());
		}else {
			System.out.println("超过透支限额!");
		}
	}

}
