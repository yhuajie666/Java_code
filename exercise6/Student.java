package exercise6;

public class Student {
	private String name;
	private String sex;
	private int age;
	private Subject sub;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String sex, int age) {
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Subject getSub() {
		return sub;
	}
	public void setSub(Subject sub) {
		this.sub = sub;
	}
	
	public void print() {
		System.out.println("����\t"+"�Ա�\t"+"����\t");
		System.out.println(name+"\t"+sex+"\t"+age);
	}
	
}

class Subject{
	private String [] sub;
	private int total;
	
}
