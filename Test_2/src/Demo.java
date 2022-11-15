
public class Demo {
	public static void main(String[] args) {
		Student [] stu=new Student[3];
		stu[0]=new Student("tom", 22);
		stu[0].setId(1001);
		stu[1]=new Student("tooy", 28);
		stu[1].setId(1002);
		stu[2]=new Student("sanny", 26);
		stu[2].setId(1003);
		
		System.out.println("姓名\t年龄\tID\t学校");
		for(int i=0;i<stu.length;i++) {
			stu[i].showStudent();
		}
		
	}
}
