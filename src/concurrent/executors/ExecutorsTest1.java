package concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:线程池的用法示例
 * @author zsj
 * @date 2017年11月1日 上午9:35:39
 */
public class ExecutorsTest1 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("code in executoe");
			}
		});
		executor.shutdown();
	}
}
