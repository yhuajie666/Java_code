import java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(num);
		System.out.println("�������������");
		double weight=scan.nextDouble();
		System.out.println(weight);*/
		/*Scanner scan=new Scanner(System.in);
		System.out.println("������С���ĳɼ�:(0~100)");
		int score=scan.nextInt();
			if(score>=0&&score<=100) {
				if(score==100) {
					System.out.println("����һ��BMW");
				}else if(score>80&&score<=99) {
					System.out.println("����һ̨iphone");
				}else if(score>=60&&score<=80) {
					System.out.println("����һ��ipad");
				}else {
					System.out.println("ʲô����Ҳû��");
				}
			}else {
				System.out.println("����������:");
			}*/
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ������:");
		int num1=scan.nextInt();
		System.out.println("������һ������:");
		int num2=scan.nextInt();
		System.out.println("������һ������:");
		int num3=scan.nextInt();
		if(num1>num2) {
			if(num3>num1){
				System.out.println(num2+","+num1+","+num3);
			}else if(num3<=num2) {
				System.out.println(num3+","+num2+","+num1);
			}else {
				System.out.println(num2+","+num3+","+num1);
			}
		}else {
			if(num3>=num2) {
				System.out.println(num1+","+num2+","+num3);
			}else if(num3<=num1) {
				System.out.println(num3+","+num1+","+num2);
			}else {
				System.out.println(num1+","+num3+","+num2);
			}
		}
	}
}
