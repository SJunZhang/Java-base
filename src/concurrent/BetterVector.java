package concurrent;

import java.util.Vector;

public class BetterVector<E> extends Vector<E>{
	//缺少即加入
	public synchronized boolean putIfAbsent(E e){
		boolean absent;
		absent = !contains(e);
		if(absent){
			add(e);
		}
		return absent;
	}

}
