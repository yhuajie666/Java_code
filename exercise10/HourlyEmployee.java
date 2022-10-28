package exercise10;

public class HourlyEmployee extends Employee{

	private int wage;//ÿСʱ����Ǯ
	private int hour;//����Сʱ
	
	protected HourlyEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}
	
	protected HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	@Override
	public double earnings() {
		return wage*hour;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [" + super.toString() + "]";
	}
	
}
