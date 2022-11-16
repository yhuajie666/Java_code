
public class S_T_Tese {
	public static void main(String[] args) {
		Student stu1=new Student("孙悟空", '男', 22, "15626262");
		stu1.show();
		stu1.working();
		stu1.reading("西游记");
		
		System.out.println("---------TeacherTest---------");
		
		Teacher t1=new Teacher("唐僧", '男', 56, "国学系");
		t1.show();
	
	}
}
