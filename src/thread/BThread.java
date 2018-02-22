package thread;

public class BThread implements Runnable {
	private Object r1;
	private Object r2;

	public BThread(Object r1, Object r2) {
		// TODO Auto-generated constructor stub
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (r2) {
			System.out.println("BThread r1" + r1);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (r1) {
			System.out.println("BThread r2" + r2);
		}
		}

	}

}
