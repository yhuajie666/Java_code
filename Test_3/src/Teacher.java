
public class Teacher extends Person implements Interface{
	private String department;
	
	public Teacher(String name,char sex,int age,String department) {
		// TODO Auto-generated constructor stub
		super(name,sex,age);
		this.department=department;
	}
	
	public void teaching(Student std, Teacher course) {
		System.out.println(course.getName()+"������"+std.getName()+"����֪ʶ!");
	}
	
	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("�����Ͽ�!");
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"������Ϣ!");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("����:"+getName()+",�Ա�"+
		getSex()+",����:"+getAge()+",����:"+department);
	}

	
}
