package exercise10;

public class SalariedEmployee extends Employee{
	private double monthSalary;

	protected SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
		
	}
	
	protected SalariedEmployee(String name, int number, MyDate birthday, double monthSalary) {
		super(name, number, birthday);
		this.monthSalary = monthSalary;
	}

	public double earnings() {
		return monthSalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [" + super.toString() + "]";
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}
	
	
	
}
