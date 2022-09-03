import java.util.Scanner;
public class NineNineTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int i,j;
		for(i=1;i<=9;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"   ");
			}
			System.out.println();
		}*/
		//100以内的所有质数的输出
		/*int i,j;
		boolean flag=true;
		for(i=2;i<=100;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
				}
			}
			if(flag==true) {
				System.out.println(i);
			}
			flag=true;
		}*/
		//优化后
		int i,j;
		boolean flag=true;
		long start=System.currentTimeMillis();
		int count=0;
		for(i=2;i<=100000;i++) {
			for(j=2;j<=Math.sqrt(i);j++) {
				//优化二：对本身是质数的自然数是有效的。
				if(i%j==0) {
					flag=false;break;//对非质数有效
				}
			}
			if(flag==true) {
				//System.out.println(i);
				count++;
			}
			flag=true;
		}
		long end=System.currentTimeMillis();
		System.out.println(count);
		System.out.println(end-start);
	}
}