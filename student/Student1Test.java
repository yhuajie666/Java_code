package student;

public class Student1Test {
	public static void main(String[] args) {
		Student1 stu=new Student1("1001","tom","ÄĞ");
		Course course=new Course("chinese","math","enginsh");
		System.out.println(stu.info());
		System.out.println(course.getEnginsh());

	}
}
