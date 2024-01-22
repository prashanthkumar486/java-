package array.program;

public class Dupicates {
	public static void main(String[] args) {

      //  int len=arr.length;
		
		int[] arr = {20,13,1,13,10,20,1,15,20,16,18};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
			
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count>=1) {
				System.out.println(arr[i]);
			}


			
			
		}
		
	}
}
