package student;

public class Student1 {
	private String number;
	private String name;
	private String sex;
	private Course[] course;
	
	public Student1() {
		
	}

	public Student1(String number, String name, String sex) {
		this.number = number;
		this.name = name;
		this.sex = sex;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
	
	
	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}

	public String info() {
		return number+"\t"+name+"\t"+sex;
	}
}
