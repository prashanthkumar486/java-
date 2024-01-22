package ques;

public class QueDs {
	static int size=4;
	static int first=0, last=0; 
	static  int[] arr=new int[size];
	public static boolean isfull() {
		if(last==size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void enque(int ele) {
		if(isfull()) {
			System.out.println("que is full");
		}
		else {
			arr[last]=ele;
			System.out.print(arr[last]+" ");
		last++;
		}
	
	}

	public static boolean isEmpty() {
		if(last==first) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void deQue() {
		if(isEmpty()) {
			System.out.println("que is empty");
		}
		else {
		  for(int i=0;i<last-1;i++) {
			  arr[i]=arr[i+1];
			  System.out.print(arr[i]+" ");
		  }
		  last--;
		}
		System.out.println();
	}

	public static void display() {
		if(isEmpty()) {
			System.out.println(" display");
		}
		else {
		  for(int i=0;i<last;i++) {
			
			  System.out.print(arr[i]+" ");
		  }
		}
	}

	public static void main(String[] args) {
		display();
		enque(11);
		enque(12);
		enque(13);
		enque(14);
		enque(15);
		deQue();
		deQue();
		deQue();
		deQue();
		deQue();
		

	}

}
