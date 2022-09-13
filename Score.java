import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			System.out.println("*************************");
			System.out.println("*1.执行程序  -100.结束  ***");
			System.out.println("*************************");
			int input=sc.nextInt();
			switch(input) {
				case 1:
					System.out.println("请输入成绩:");
					break;
				case -100:
					System.exit(input);
					break;
			}
			int score=sc.nextInt();
			int i=score/10;
			switch(i) {
				case 10:
					System.out.println("A");break;
				case 9:
					System.out.println("B");break;
				case 8:
					System.out.println("C");break;
				case 7:
					System.out.println("D");break;
				case 6:
					System.out.println("E");break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:
					System.out.println("F");break;
				default:
					System.out.println("重新输入:");break;
			}
			
		}
	}
}
