package thread.exception;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Description:通过Future来处理线程中的异常
 * 
 * @author sjZhang
 * @date 2018年2月26日下午2:24:47
 */
public class ThreadException {
	public static void main(String[] args) {
		ExecutorService executorServer = Executors.newCachedThreadPool();
		Future<String> future = executorServer.submit(new ChildThread());
		try {
			future.get();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

/** 模拟在线程中抛出异常 **/
class ChildThread implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("before throw");
		throwException();
		System.out.println("after throw");
		return "ChildThread Call function";
	}

	private void throwException() {
		throw new RuntimeException("ChildThread1 exception");
	}

}

class ChildRunnableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("before throw");
		throwException();
		System.out.println("after throw");
	}
	
	private void throwException() {
		throw new RuntimeException("ChildThread1 exception");
	}
	
}
