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
		//100���ڵ��������������
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
		//�Ż���
		int i,j;
		boolean flag=true;
		long start=System.currentTimeMillis();
		int count=0;
		for(i=2;i<=100000;i++) {
			for(j=2;j<=Math.sqrt(i);j++) {
				//�Ż������Ա�������������Ȼ������Ч�ġ�
				if(i%j==0) {
					flag=false;break;//�Է�������Ч
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