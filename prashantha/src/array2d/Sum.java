package array2d;

public class Sum {
	public static void main(String[] args) {
		int[][] num={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				sum=sum+num[i][j];
			}
		}
		System.out.println(sum);
	}

}
