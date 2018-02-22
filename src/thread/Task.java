package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

public class Task {
	private final AtomicLong al = new AtomicLong();
	
	public static void main(String[] args) {
		for(;;){
			System.out.println("aa");
		}
	}
	
	public void test(){
		FutureTask ft1 = setFutureTask();
	}
	
	public FutureTask<String> setFutureTask(){
		return new FutureTask<String>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("Stay in setFutureTask Function");
				return "Hello";
			}
			
		});
	}

}
