package exercise7;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test=new GeometricTest();
		
		Circle c1=new Circle(2.5, "red", 2.2);
		
		Circle c2=new Circle(3.5, "blue", 2.2);
		
		double s2 = test.displayGeometricObject(c2);
		double s1 = test.displayGeometricObject(c1);
		
		boolean isEqual = test.equalsArea(c1, c2);
		System.out.println("c1��c2�����:"+isEqual);
		
		System.out.println("�����:"+s1);
		System.out.println("�����:"+s2);
		
	}
	
	public boolean equalsArea(GeometricObject o1,GeometricObject o2) {
		return o1.fineArea()==o2.fineArea();
	}
	
	public double displayGeometricObject(GeometricObject o) {
		return o.fineArea();
	}
}
