package exercise9;

public class AccountTest {
	public static void main(String[] args) {
		
		Account acct1=new Account();
		Account acct2=new Account("123456",100);
		
		Account.setInterestRate(0.0125);

		System.out.println(acct1.getId());
		System.out.println(acct2.getId());
		
	}
}
