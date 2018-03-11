package thread.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Description:FutureTask的简单使用demo
 * @author sjZhang
 * @date 2018年2月26日下午4:40:16
 */
public class FutureDemo3 {

	//定义一个线程池
	private static final ExecutorService executorService = Executors.newCachedThreadPool();
	public static void main(String[] args) {
		FutureTask<String> futureTask = new FutureTask<String>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("call");
				return "FutureCallableDemo";
			}
		});

		try {
			executorService.execute(futureTask);
			System.out.println(futureTask.get());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			executorService.shutdown();
		}

	}

}
