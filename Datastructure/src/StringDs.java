
public class StringDs {
	static boolean b=false;
	static String str="{[({})]}";
	static int size=str.length(),top=-1;
	static char[] arr=new char[size];

	public static boolean isFull() {
		if(top==size-1) {
			return true;
		}
		else {
			return false;
		}	
	}

	public static void push(char ele) {
		if(isFull()) {
			System.out.println("stack is full");
		}
		else {
			top++;
			arr[top]=ele;
			//System.out.print(stack[top]+" ");
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
			b=true;
			System.out.println("stack is empty");	
		}
		else {
			//System.out.println(stack[top]+" deleted ");
			top--;
		}
	}

	public static void display() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(arr[i]+" ");
			}
		}
	}

	public static void peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(arr[top]+" ");
		}
	}

	public static void main(String[] args) {
		for(int i=0;i<size;i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='[' ||str.charAt(i)=='(') {
				push(str.charAt(i));
			}

			else if(str.charAt(i)==')') {
				if(!isEmpty() && arr[top]=='(')
					pop();
				else {
					System.out.println("not balenced");
					return;
				}	
			}

			else if(str.charAt(i)==']') {
				if(!isEmpty() &&arr[top]=='[')
					pop();
				else {
					System.out.println("not balenced");
					return;
				}	
			}

			else if(str.charAt(i)=='}') {
				if(!isEmpty() && arr[top]=='{')
					pop();
				else {
					System.out.println("not balenced");
					return;
				}	
			}

			else {
				System.out.println("balenced");
				return;
			}
		}

		if(isEmpty()&& b==false) {
			System.out.println("balenced");
		}
		else {
			System.out.println("not balelced");
		}
	}
}
