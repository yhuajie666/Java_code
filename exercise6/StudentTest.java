package exercise6;
import java.util.Scanner;
public class StudentTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student("tom","男",25);
		String [] a=new String [10];
		
		
		System.out.println("输入要选的科目数目:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("输入你的科目:");
			a[i]=sc.next();
		}
		
		s1.print();
		
		for(int i=0;i<n;i++) {
			System.out.println("所选的科目"+(i+1)+"：  "+a[i]);
		}
	}
}
