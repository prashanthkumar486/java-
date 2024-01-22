package maveninter;

import org.springframework.stereotype.Component;

@Component
public class Saving implements Account{

	@Override
	public void withdraw() {
		System.out.println("withdraw from saving");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit to saving");
		
	}
	
	

}
