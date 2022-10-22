package exercise9;

import java.util.Scanner;
import java.util.Vector;

public class WarrperTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		int maxscore=0;
		
		for(;;) {
			System.out.println("请输入学生成绩（以负数结束）");
			int score=sc.nextInt();
			if(score<0) {
				break;
			}
			if(score>100) {
				continue;
			}
			Integer inscore=new Integer(score);
			v.addElement(inscore);
			if(score>maxscore) {
				maxscore=score;
			}
		}
		char Score;
		for(int i=0;i<v.size();i++) {
			Object obj=v.elementAt(i);
			Integer inscore=(Integer)obj;
			int score=inscore.intValue();
			if(maxscore-score<=10) {
				Score='A';
			}else if(maxscore-score<=20) {
				Score='B';
			}else if(maxscore-score<=30) {
				Score='C';
			}else {
				Score='D';
			}
			
			System.out.println("学生："+(i+1)+"成绩："+score+"等级："+Score);
			System.out.println();
		}
	}
}
