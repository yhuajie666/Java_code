
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
		System.out.println(getName()+"����ѧϰ!");
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
				getSex()+",����:"+getAge()+",ѧ��:"+id);
	}
	
	public void reading(String book) {
		System.out.println(getName()+"���ڶ�һ��"+book);
	}
	
}
