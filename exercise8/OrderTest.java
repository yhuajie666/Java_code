package exercise8;

public class OrderTest {
	public static void main(String[] args) {
		Order order1=new Order(12,"jd");
		Order order2=new Order(12,"jd");
		
		boolean isEqual = order1.equals(order2);//equals()·½·¨ÖØÐ´
		System.out.println(isEqual);
		
		System.out.println(order1==order2);
	}
}
