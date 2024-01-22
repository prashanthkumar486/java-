package ppp;

public class Jerry extends Thread{
	public void run() {
		for(int j=6;j<=10;j++) {
			System.out.println("jerry:"+j);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
