package exercise10;
import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���뵱�µ��·�:");
		int month=sc.nextInt();
		Employee [] emp=new Employee[2];
		emp[0]=new SalariedEmployee("tom",1002,new MyDate(1992,2,28),10000);
		emp[1]=new HourlyEmployee("anny",1003,new MyDate(1995,5,1),60,240);
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
			double salary=emp[i].earnings();
			System.out.println("�¹���"+salary);
			
			if(month==emp[i].getBirthday().getMonth()) {
				System.out.println("���տ���");
			}
		}
	}
}
