package Account.Bank;

public class Test {
	public static void main(String[] args) {
		Bank bank=new Bank();

		bank.addCustomer("jane", "smith");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		
		bank.getCustomer(0).getAccount().withdraw(1500);
		
		bank.addCustomer("tom", "smith");
		bank.getCustomer(1).setAccount(new Account(2000));
		bank.getCustomer(1).getAccount().withdraw(1500);
		
		bank.addCustomer("damy", "smith");
		bank.getNumberOfCustomer();
	}
}
