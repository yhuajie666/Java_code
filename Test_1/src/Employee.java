
public class Employee {
	private String name;
	private int age;
	private double basic;//基本工资
	private double allowance;//津贴
	private double tax;//扣税
	
	protected Employee(String name, int age, double basic, double allowance, double tax) {
		super();
		this.name = name;
		this.age = age;
		this.basic = basic;
		this.allowance = allowance;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double total() {
		return basic+allowance-tax;
	}
	
	public String getEmployee() {
		return name+"\t"+age+"\t"+basic+"\t\t"+allowance+"\t\t"+tax;
	}
	
	
}
