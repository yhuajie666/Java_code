import java.util.Scanner;
public class Fortest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int i=0,num=0;
		for(i=0;i<10;i++) {
			num++;
			System.out.println("Hello World!");
		}
		System.out.println(num);*/
		/*int i=0;
		for(i=1;i<=150;i++) {
			System.out.print(i+"");
			if(i%3==0) {
				System.out.print("foo");
			}if(i%5==0) {
				System.out.print("biz");
			}if(i%7==0) {
				System.out.print("baz");
			}
			System.out.println();
		}*/
		/*System.out.println("�������һ��������:");
		int m=sc.nextInt();
		System.out.println("������ڶ���������:");
		int n=sc.nextInt();
		int min=(m<=n)?m:n;
		for(int i=min;i>=1;i--) {
			if(m%i==0&&n%i==0) {
				System.out.println("���Լ����"+i);
				break;
			}
		}
		int max=(m>=n)?m:n;
		for(int i=max;i<=m*n;i++) {
			if(i%m==0&&i%n==0) {
				System.out.println("��С��������"+i);
				break;
			}
			
		}*/
		int positiveNumber=0;
		int negativeNumber=0;
		System.out.println("���������������(��0����):");
		while(true) {
			int number=sc.nextInt();
			if(number>0) {
				positiveNumber++;
			}else if(number<0) {
				negativeNumber++;
			}else {
				break;
			}
		}
		System.out.println("���������������"+positiveNumber);
		System.out.println("����ĸ���������"+negativeNumber);
	}
}
