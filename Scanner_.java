import java.util.Scanner;
public class Scanner_ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������5��1��10֮���������");
		for(int i=0;i<5;i++) {
			int s=sc.nextInt();
			if(s>=1&&s<=10) {
				System.out.println(s);
			}else {
				System.out.println("��������,��������:");
			}
		}
		
	}
}
