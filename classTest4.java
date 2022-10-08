
public class classTest4 {
	public static void main(String[] args) {
		/*PassObject p=new PassObject();
		Circle c=new Circle();
		p.printfAreas(c, 5);*/
		person p=new person();
		p.setname("tom");
		p.setname("tony");
		p.getname();
		p.setage(21);
		p.getage();
		
	}
}



class person{
	private String name;
	private int age;
	public void setname(String n) {name=n;}//设置属性
	public String getname() {
		System.out.println("姓名："+name);
		return name;}//获取属性
	public void setage(int a) {age=a;}
	public int getage() {
		System.out.println("年龄："+age);
		return age;}
}
class Circle{
	double radius;
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
class PassObject{
	public void printfAreas(Circle c,int time) {
		System.out.println("radis\t\t"+"Area");
		for(int i=1;i<=time;i++) {
			c.radius=i;
			System.out.print(c.radius+"\t\t"+c.findArea()+"\n");
		}
	}
}
