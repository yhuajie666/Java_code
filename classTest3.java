
public class classTest3 {
	public static void main(String[] args) {
		int [] arr=new int []{45,78,66,-45,78,99,-15,-63} ;
		str p=new str();
		int m=p.getmax(arr);
		System.out.println("max="+m);
		p.print(arr);
		p.sort(arr);
		p.print(arr);
	}
}



class str{
	public int getmax(int [] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public void sort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	
	public void print(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
}




	
