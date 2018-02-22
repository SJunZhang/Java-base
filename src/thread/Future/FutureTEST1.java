package thread.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTEST1 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		ArchiveSearcher searcher = new ArchiveSearcherImpl();
		final String target="search";
		System.out.println("main begin code");
		FutureTask<String> future = new FutureTask<>(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println("call function");
				return searcher.search(target);
			}
		});
		System.out.println("main before run execute code");
		executor.execute(future);
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main next run execute code");
		executor.shutdown();

	}

}

class ArchiveSearcherImpl implements ArchiveSearcher {

	@Override
	public String search(String target) {
		return "search";
	}

}

class App {
	ExecutorService executor = Executors.newCachedThreadPool();
	ArchiveSearcher searcher = new ArchiveSearcherImpl();

	void showSearch(final String target) throws InterruptedException {
		Future<String> future = executor.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return searcher.search(target);
			}
		});
		
		displayOtherThings();// 搜索的时候做别的事情
		try {
			displayText(future.get());
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void displayOtherThings() {
		System.out.println("do other things while searching");
	}

	void displayText(String result) throws ExecutionException {
		System.out.println("result");
	}

}
