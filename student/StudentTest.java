package student;

public class StudentTest {
	public static void main(String[] args) {
		Student student1=new Student("1001","1","����",'��',26);
		Student student2=new Student();
		student1.setName("tom");
		System.out.println(student1.info());
		student2.setName("tony");
		student1.setAge(15);
		student2.setAge(18);
		if(student1.getAge()>student2.getAge()) {
			
			System.out.println("����ϴ����"+student1.getName()+"��"+student1.getAge()+"��");
		}else {
			
			System.out.println("����ϴ����"+student2.getName()+"��"+student2.getAge()+"��");
		}
		System.out.println("��"+Student.getCount()+"λѧ��");
	}
}
