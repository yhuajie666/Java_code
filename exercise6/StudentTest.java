package exercise6;
import java.util.Scanner;
public class StudentTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student("tom","��",25);
		String [] a=new String [10];
		
		
		System.out.println("����Ҫѡ�Ŀ�Ŀ��Ŀ:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("������Ŀ�Ŀ:");
			a[i]=sc.next();
		}
		
		s1.print();
		
		for(int i=0;i<n;i++) {
			System.out.println("��ѡ�Ŀ�Ŀ"+(i+1)+"��  "+a[i]);
		}
	}
}
