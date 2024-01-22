package javabeancalss;

public class Company {
	Beverages vendingMachine(int choice) {
		
		
		
		if(choice==1) {
			return new Coffee();
		}
		else if (choice==2) {
			return new Tea();
		}
		else if (choice ==3) {
			return new Beverages();
		}
		else {
			return null;
		}
	}

}
