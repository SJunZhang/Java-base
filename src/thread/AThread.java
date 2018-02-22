package thread;

public class AThread implements Runnable{
	private Object r1;
	private Object r2;
	
	public AThread(Object r1,Object r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (r1) {
			System.out.println("AThread r1"+r1);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (r2) {
			System.out.println("AThread r2"+r2);
		}
		}
		
	}

}
