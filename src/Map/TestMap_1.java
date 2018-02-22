package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @Description:Map在迭代的时候能否删除key,如果不能怎样去删除？
 * @author zsj
 * @date 2018年2月6日 上午9:11:28
 */
public class TestMap_1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("one", "red");
		map.put("two", "blue");
		map.put("three", "whilte");

		/** 1.8的语法删除 **/
		map.entrySet().removeIf(entry -> !map.containsKey("one"));

		/** 用iterator来删除key **/
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		for (; iter.hasNext();) {
			Entry<String, String> entry = iter.next();
			if (entry.getKey().equalsIgnoreCase("blue")) {
				iter.remove();
			}
		}

		/** 用这种方式删除key,直接报错。 **/
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getKey().equalsIgnoreCase("blue")) {
				map.remove(entry.getKey());
			}
		}

	}

}
