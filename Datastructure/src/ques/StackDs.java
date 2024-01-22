package ques;

public class StackDs {
	static int size=5;
	static int[] stack=new int[size];
	static int top=-1;
	public static boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void push(int ele) {
		if(isFull()) {
			System.out.println("stack is full");
		}
		else {
			top++;
			stack[top]=ele;
			System.out.print(stack[top]+" ");
		}
	}
	public static boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(stack[top]+" deleted ");
			top--;
		}
	}
	public static void display() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(stack[i]+" ");
			}
			
		}
	}
	public static void peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(stack[top]+" ");
		}
	}
	public static void main(String[] args) {
		
		push(11);
		push(12);
		push(13);
		push(14);
		push(15);
		push(16);
		System.out.println("---------");
		peek();
		pop();
		pop();
		pop();
		pop();
		pop();
		pop();
		display();
	}

}
