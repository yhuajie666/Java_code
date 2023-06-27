package ListClass;

public class student {
	private int id;
	private String name;
	private String number;
	private String sex;
	private String grade;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(int id, String name, String number, String sex, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.sex = sex;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", number=" + number + ", sex=" + sex + ", grade=" + grade
				+ "]";
	}
	
	
}
