package reetrantLock;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Java-base
 * @description: 读写锁Map测试类
 * @author: zhangshijun
 * @create: 2018-09-23 17:24
 */
public class ReadWriteMapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        ReadWriteMap<String, String> readWriteMap = new ReadWriteMap(map);
        readWriteMap.put("one", "oneValue");
        String value = readWriteMap.get("one");
        System.out.println(value);
    }
}