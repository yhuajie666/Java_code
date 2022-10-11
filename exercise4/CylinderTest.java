package exercise4;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cy=new Cylinder();
		cy.setLength(5);
		cy.setRadius(2);
		double a=cy.findArea();
		double v=cy.findVolume();
		System.out.println("Cycle="+a);
		System.out.println("Cylinder="+v);
	}
}