package exercise9;

import java.util.Scanner;
import java.util.Vector;

public class WarrperTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		int maxscore=0;
		
		for(;;) {
			System.out.println("������ѧ���ɼ����Ը���������");
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
			
			System.out.println("ѧ����"+(i+1)+"�ɼ���"+score+"�ȼ���"+Score);
			System.out.println();
		}
	}
}
