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
		/*System.out.println("请输入第一个正整数:");
		int m=sc.nextInt();
		System.out.println("请输入第二个正整数:");
		int n=sc.nextInt();
		int min=(m<=n)?m:n;
		for(int i=min;i>=1;i--) {
			if(m%i==0&&n%i==0) {
				System.out.println("最大公约数是"+i);
				break;
			}
		}
		int max=(m>=n)?m:n;
		for(int i=max;i<=m*n;i++) {
			if(i%m==0&&i%n==0) {
				System.out.println("最小公倍数是"+i);
				break;
			}
			
		}*/
		int positiveNumber=0;
		int negativeNumber=0;
		System.out.println("请随机输入有理数(以0结束):");
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
		System.out.println("输入的正数个数是"+positiveNumber);
		System.out.println("输入的负数个数是"+negativeNumber);
	}
}
