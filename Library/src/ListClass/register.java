package ListClass;

public class register {
	private int id;
	private String user;
	private String password;
	
	public register(int id, String user, String password) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
	}

	public register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
