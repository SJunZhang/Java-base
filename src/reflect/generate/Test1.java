package reflect.generate;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
		
		
	}
	
	//协变：用一个窄类型代替宽类型，如下所示Integer是窄类型，Number是宽类型
	public static void covariant(){
		Number n1 = new Integer(1);
		System.out.println(n1);
		Number [] arry = new Integer[10];
	}
	
	//泛型不支持协变，需借助通配符？
	public static void covariant2(){
		List<?> list1 = new ArrayList<String>();
	}
	
	public static void contravariant(){
		List<? super Integer> list1 = new ArrayList<Number>();
	}
	
	

}
