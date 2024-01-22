package javabeancalss;

public class AdharCard {
	
	private static AdharCard a=null;
	
	private AdharCard() {
		System.out.println("to create new adadhar card");
	}
	
	public static void CreateAdhar() {
		if(a==null) {
			a= new AdharCard();
		}
		
	}

}
