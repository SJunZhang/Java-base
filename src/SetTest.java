import java.util.HashSet;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		String [] strArr = {"aaa","bbb","aaa"};
		Set<String> strSet = new HashSet<String>();
		for(int i=0;i<strArr.length;i++){
			strSet.add(strArr[i]);
		}
		System.out.println(strSet.toString());
	}

}
