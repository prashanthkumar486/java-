package projecttest3;

import org.springframework.stereotype.Component;

@Component
public class Multiple implements Calculate {

	@Override
	public void sum() {
		System.out.println("multiple is succesful");
		
	}

}
