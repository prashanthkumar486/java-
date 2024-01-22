package ppp;

public class Tom extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("tom:"+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
