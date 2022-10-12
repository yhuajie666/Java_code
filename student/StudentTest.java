package student;

public class StudentTest {
	public static void main(String[] args) {
		Student student1=new Student("1001","1","张三",'男',26);
		Student student2=new Student();
		student1.setName("tom");
		System.out.println(student1.info());
		student2.setName("tony");
		student1.setAge(15);
		student2.setAge(18);
		if(student1.getAge()>student2.getAge()) {
			
			System.out.println("年龄较大的是"+student1.getName()+"是"+student1.getAge()+"岁");
		}else {
			
			System.out.println("年龄较大的是"+student2.getName()+"是"+student2.getAge()+"岁");
		}
		System.out.println("有"+Student.getCount()+"位学生");
	}
}
