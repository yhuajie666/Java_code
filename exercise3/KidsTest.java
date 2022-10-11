package exercise3;

public class KidsTest {
	public static void main(String[] args) {
		Kids someKid=new Kids();
		someKid.setSex(1);
		someKid.manOrWoman();
		someKid.setSalary(1);
		someKid.employeed();
		
		System.out.println(someKid.getSex());
		someKid.setYearsOld(100);
		someKid.printAge();
	}

}
