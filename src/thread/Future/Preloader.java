package thread.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Description:
 * @author sjZhang
 * @date 2018年2月26日下午4:46:40
 */
public class Preloader {
	private final FutureTask<String> future = new FutureTask<>(new Callable<String>() {
		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			return "Preloader";
		}
	});

	private final Thread thread = new Thread(future);

	public void start() {
		thread.start();
	}

	public String get() throws InterruptedException, ExecutionException {
		return future.get();
	}

}
