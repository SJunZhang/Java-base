package concurrent.interrupt;

import java.util.concurrent.TimeUnit;

public class InterruptSchedulTest1 {

	public static void timedRun(final Runnable r, long timeout, TimeUnit unit) throws InterruptedException {

		class RethrowableTask implements Runnable {
			private volatile Throwable t;

			@Override
			public void run() {
				try {
					r.run();
				} catch (Throwable t) {
					this.t = t;
				}

			}
			
		}
		
		RethrowableTask task = new RethrowableTask();
		final Thread taskThread = new Thread(task);
		taskThread.start();
		
		
		
		
	}

}
