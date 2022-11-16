
public class Teacher extends Person implements Interface{
	private String department;
	
	public Teacher(String name,char sex,int age,String department) {
		// TODO Auto-generated constructor stub
		super(name,sex,age);
		this.department=department;
	}
	
	public void teaching(Student std, Teacher course) {
		System.out.println(course.getName()+"正在向"+std.getName()+"传授知识!");
	}
	
	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("正在上课!");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"正在休息!");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("姓名:"+getName()+",性别"+
		getSex()+",年龄:"+getAge()+",部门:"+department);
	}

	
}
