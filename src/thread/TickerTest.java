package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TickerTest{
	public static void main(String[] args) {
		ExecutorService excutor = Executors.newCachedThreadPool();
		Ticker ticker = new Ticker(100);
		for (int i = 0; i < 3; i++) {
			excutor.submit(ticker);
		}

//		 Ticker ticker = new Ticker(100);
//		 Thread thread1 = new Thread(ticker, "窗口1");
//		 Thread thread2 = new Thread(ticker, "窗口2");
//		 Thread thread3 = new Thread(ticker, "窗口3");
//		
//		 thread1.start();
//		 thread2.start();
//		 thread3.start();

	}
}