package threadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:大致演示了ThreadLocal的用法,ThreadLocal提供了get和Set方法
 * @author zsj
 * @date 2017年12月14日 下午8:01:00
 */
public class TestNum {
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};

	public int getNextNum() {
		seqNum.set(seqNum.get() + 5);
		return seqNum.get();
	}

	public static void main(String[] args) {
		TestNum tNum = new TestNum();
		ExecutorService executor = Executors.newCachedThreadPool();
		TestClient client = new TestClient(tNum);
		for(int i=0;i<3;i++){
			executor.submit(client);
		}
	}

}

class TestClient extends Thread {
	private TestNum tNum;

	public TestClient(TestNum tNum) {
		this.tNum = tNum;
	}

	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println(Thread.currentThread().getName() + "---》" + tNum.getNextNum());
		}
	}
}
