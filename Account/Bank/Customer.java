package Account.Bank;

public class Customer {
	private String firstname;
	private String lastname;
	private Account account;
	
	public Customer(String f,String l) {
		firstname=f;
		lastname=l;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	
}
