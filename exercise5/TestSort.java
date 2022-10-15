package exercise5;

public class TestSort {
	public static void main(String[] args) {
		boolean isFlag=false;
		int [] arr={1,5,7,8,9,10,0};
		int key=100;
		int num=arr.length-1;
		for(int i=0;i<arr.length;i++) {//寻找合适的插入位置
			if(arr[i]>key) {
				num=i;break;
			}
		}
		for(int i=arr.length-1;i>num;i--) {//向后移动元素
			arr[i]=arr[i-1];
		}
		arr[num]=key;//赋值
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
