package exercise7;

public class MyRectangle extends GeometricObject{
	private double width;//¿í
	private double height;//³¤
	
	public MyRectangle(double width,double height,String color, double weight) {
		super(color,weight);
		this.width=width;
		this.height=weight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double fineArea() {
		return width*height;
	}
}
