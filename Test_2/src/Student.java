
public class Student {
	private String name;
	private int age;
	private int id;
	public static String school="天津天狮学院";
	protected Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getStudent() {
		return id+name+age;
	}
	
	public void showStudent() {
		System.out.println(id+"\t"+name+"\t"+age+"\t"+school);
	}
	
}
