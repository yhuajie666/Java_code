package exercise3;

public class Kids extends Mankind {
	private int yearsOld;
	
	
	public int getYearsOld() {
		return yearsOld;
	}


	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}


	public void printAge() {
		System.out.println("yearsOld="+yearsOld);
	}
}
