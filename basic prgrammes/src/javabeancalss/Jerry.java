package javabeancalss;

public class Jerry extends Thread {
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("jerry:"  +i);
			try {
				Thread.sleep(20000);
			}
			
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
