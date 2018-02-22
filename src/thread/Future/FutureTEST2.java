package thread.Future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTEST2 {
	private final static ExecutorService executor = Executors.newCachedThreadPool();

	public static void main(String[] args) {
		List<Integer> list = initialList();
		/* 计算总和 */
		FutureTask<Integer> futureTotal = new FutureTask<>(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				Integer total = 0;
				for (Integer value : list) {
					total += value;
				}
				return total;
			}

		});

		/* 对list排序 */
		FutureTask<List<Integer>> futureTotal2 = new FutureTask<>(new Callable<List<Integer>>() {
			@Override
			public List<Integer> call() throws Exception {
				Integer[] arr = new Integer[list.size()];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = list.get(i);
				}
				bubleSort(arr);
				System.out.println(Arrays.toString(arr));
				return Arrays.asList(arr);
			}
		});

		// CompletionService<Integer> service = new
		// ExecutorCompletionService<Integer>(executor);

		executor.execute(futureTotal);
		System.out.println("list的总数为：");
		try {
			System.out.println(futureTotal.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		executor.execute(futureTotal2);
		System.out.println("对list排序：");
		try {
			List<Integer> resultList = futureTotal2.get();
			System.out.println(Arrays.toString(resultList.toArray()));
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//executor.shutdown();

	}

	private static List<Integer> initialList() {
		List<Integer> initialList = new ArrayList<Integer>();
		int temp = 0;
		for (int i = 0; i < 10; i++) {
			temp = (int) (Math.random() * 1000);
			initialList.add(temp);
		}
		return initialList;
	}

	private static void bubleSort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

}
