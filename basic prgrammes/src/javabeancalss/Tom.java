package javabeancalss;

public class Tom extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("tom:" +i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
