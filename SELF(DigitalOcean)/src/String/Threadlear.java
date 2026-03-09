package String;

class Arc extends Thread{
	public int thnum;
 Arc(int thnum) {
		this.thnum = thnum;
	}
 
	public void run() {
	for(int i = 0;i<3;i++) {
		System.out.println(i + " "+thnum);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.getMessage();
		}
	}
	}
}

public class Threadlear {
public static void main(String[] args) throws InterruptedException {
//	Arc th = new Arc();
//	Arc th1 = new Arc();
//	th.start();
//	th1.start();
	
	for(int i = 0;i<3;i++) {
		Arc th = new Arc(i);
		th.start();
//		th.join();
	}
	
}
}
