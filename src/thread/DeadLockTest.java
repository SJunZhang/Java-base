package thread;

public class DeadLockTest {
	public static void main(String[] args) {
		final Object r1 = 1;
		final Object r2 = 2;
		
		
		Thread thread1 = new Thread(new AThread(r1, r2), "测试线程1");
		Thread thread2 = new Thread(new BThread(r1, r2), "测试线程2");
		
		thread1.start();
		thread2.start();
		
	}

}
