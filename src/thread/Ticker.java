package thread;

import java.util.concurrent.TimeUnit;

public class Ticker implements Runnable {

	private int ticksNum = 10;
	private boolean flag = true;

	public Ticker(int ticksNum) {
		this.ticksNum = ticksNum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (flag) {
			ticker();
		}

	}

	private void ticker() {

		synchronized (this) {

			if (ticksNum <= 0) {
				flag = false;
			} else {
				ticksNum--;
				try {
					TimeUnit.SECONDS.sleep(1);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "售出票序列号：" + ticksNum);
			}
		}

	}

}
