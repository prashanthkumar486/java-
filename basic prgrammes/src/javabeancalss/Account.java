package javabeancalss;

public class Account {
	
	
	public static Account a =null;
	
	private Account() {
		System.out.println("to create acc");
	}
	
	public static void createObject() {
		if(a==null) {
			a=new Account();
		}
		else {
			System.out.println("not created");
		}
	}
	
	
	
	
	
	
}




