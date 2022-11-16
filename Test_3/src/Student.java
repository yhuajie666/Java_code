
public class Student extends Person implements Interface{
	private String id;
	
	public Student(String name,char sex,int age,String id) {
		// TODO Auto-generated constructor stub
		super(name,sex,age);
		this.id=id;
	}
	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"正在学习!");
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
				getSex()+",年龄:"+getAge()+",学号:"+id);
	}
	
	public void reading(String book) {
		System.out.println(getName()+"正在读一本"+book);
	}
	
}
