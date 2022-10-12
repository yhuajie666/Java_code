package student;

public class Student {
	private String number;
	private String grade;
	private String name;
	private char sex;
	private int age;
	private static int count;
	
	public Student() {
		count++;
	}

	public Student(String number, String grade, String name, char sex, int age) {
		this.number = number;
		this.grade = grade;
		this.name = name;
		this.sex = sex;
		this.age = age;
		count++;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
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

	public static int getCount() {
		return count;
	}
	
	public String info() {
		return number+"\t"+grade+"\t"+name+"\t"+sex+"\t"+age;
	}

}
