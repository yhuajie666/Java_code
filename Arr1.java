import java.util.Scanner;
import java.util.Arrays;
public class Arr1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*int i;
		int [] arr=new int [5];
		System.out.println("����5λѧ���ɼ�:");
		for(i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("��߳ɼ���"+max);
		char lev=0;
		for(i=0;i<arr.length;i++) {
			if(max-arr[i]<=10) {
				lev='A';
			}else if(max-arr[i]<=20) {
				lev='B';
			}else {
				lev='C';
			}
			System.out.println(i+1+"λѧ���ĳɼ���"+arr[i]+"�ȼ���"+lev);
		}
		int [][]arr=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		int sum=0;
		for(i=0;i<arr.length;i++) {		//�������
			for(j=0;j<arr[i].length;j++) {
				sum=arr[i][j];	//��ֵ
				System.out.print(sum+" ");	//���
			}
			System.out.println();
		}*/
		/*int [][] arr=new int [10][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int [i+1];
			arr[i][0]=arr[i][i]=1;
			for(int j=1;j<arr[i].length-1;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}*/
		//���ֲ���
		/*int [] arr1=new int [] {5,6,8,15,65,78,88,95,154};
		int head=0;
		int end=arr1.length;
		int key=154;
		boolean flag=false;
		while(head<=end) {
			int mid=(head+end)/2;
			if(arr1[mid]==key) {
				flag=true;
				System.out.println("�ҵ��ˣ��±�Ϊ:"+ mid);
				break;
			}else if(arr1[mid]<key) {
				head=mid+1;
			}else if(arr1[mid]>key){
				end=mid-1;
			}
		}
		if(flag==false)
			System.out.println("not fail");*/
		/*int [] arr=new int [] {45,25,78,5,4,65,99,81,36,154,589};
		for(int i=0;i<arr.length-1;i++) {			//ð������
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {		//��С������
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
		
	}
}
