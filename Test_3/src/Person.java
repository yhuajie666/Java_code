
public class Person {
	private String name;
	private char sex;
	private int age;
	protected Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected Person(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void saying(Person per,String msg) {
		System.out.println(per+"к╣ак"+msg);
	}
	
	
}

interface Interface{
	
	void working();
	void rest();
	void show();
}
