package exercise4;

public class Circle {
	private double radius;//�뾶
	
	public Circle() {
		radius=1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
