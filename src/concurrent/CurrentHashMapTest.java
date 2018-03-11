package concurrent;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CurrentHashMapTest {
	
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		HashMap<String,String> hashMap = new HashMap<>();
		concurrentHashMap.put("one", "hello");
	}

}
