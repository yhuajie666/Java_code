package student;

public class Course {
	private String chinese;
	private String math;
	private String enginsh;
	public Course() {
	
	}
	public Course(String chinese, String math, String enginsh) {
		
		this.chinese = chinese;
		this.math = math;
		this.enginsh = enginsh;
	}
	public String getChinese() {
		return chinese;
	}
	public void setChinese(String chinese) {
		this.chinese = chinese;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getEnginsh() {
		return enginsh;
	}
	public void setEnginsh(String enginsh) {
		this.enginsh = enginsh;
	}
	
	
	
}
