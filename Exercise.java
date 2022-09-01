import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int value=(int)(Math.random()*90+10);//获取随机数
		System.out.println(value);//打印随机数
		System.out.println("请输入你的彩票号码:>"+"两位数");
		int score=sc.nextInt();
		if(score==value) {
			System.out.println("彩票中奖获得1000人民币！");
		}else if(score!=value){
			System.out.println("未获奖！");
		}*/
		System.out.println("请输入year>");
		int year=sc.nextInt();
		System.out.println("请输入month>");
		int month=sc.nextInt();
		System.out.println("请输入day>");
		int day=sc.nextInt();
		int numdays=0;
		switch(month) {
		case 12:
			numdays+=30;
		case 11:
			numdays+=31;
		case 10:
			numdays+=30;
		case 9:
			numdays+=31;
		case 8:
			numdays+=31;
		case 7:
			numdays+=30;
		case 6:
			numdays+=31;
		case 5:
			numdays+=30;
		case 4:
			numdays+=31;
		case 3:
			if((year%4==0&&year%100!=0)||year%400==0) {
				numdays+=29;
			}else {
				numdays+=28;
			}
		case 2:
			numdays+=31;
		case 1:
			numdays+=day;
		}
		System.out.println(year+"年"+month+"月"+day+"日是当年的第"+numdays+"天.");
	}
}
