package threadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestString {
	
	private static ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
		@Override
		protected String initialValue() {
			// TODO Auto-generated method stub
			return "TestString";
		}
	};
	
	public String getStrByThreadLocal(){
		return threadLocal.get();
	}
	
	
	public static void main(String[] args) {
		
		TestString ts = new TestString();
//		String str = ts.threadLocal.get();
//		System.out.println(str);
		
		ExecutorService es = Executors.newCachedThreadPool();
		es.submit(new TestStringClient(ts));
	}

}

class TestStringClient implements Runnable{
	private TestString ts;
	public TestStringClient(TestString ts) {
		this.ts = ts;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str = ts.getStrByThreadLocal();
		System.out.println(Thread.currentThread().getName()+","+str);
		
	}
	
}
