
public class EmployeeTest {
	public static void main(String[] args) {
		Employee [] employee=new Employee[4];
		employee[0]=new Employee("�����", 22, 3210, 1204, 280);
		employee[1]=new Employee("��˽�", 21, 1820, 980, 160);
		employee[2]=new Employee("ɳ����", 28, 4520, 1420, 154);
		employee[3]=new Employee("�׹Ǿ�", 26, 4518, 1520, 120);
		
		double sum1=0;
		double sum2=0;
		for(int i=0;i<employee.length;i++) {
			sum1+=employee[i].getBasic();
			sum2+=employee[i].getAllowance();
		}
		double avg1=sum1/employee.length;
		double avg2=sum2/employee.length;
		System.out.println("basic��ƽ��ֵavg1="+avg1);
		System.out.println("allowance��ƽ��ֵavg2="+avg2);
		
		System.out.println("����\t����\tbasic\t\ttallowance\ttax\ttotal");
		for(int i=0;i<employee.length;i++) {
			System.out.println(employee[i].getEmployee()+"\t"+employee[i].total());
			
		}
		
		
	}
}
