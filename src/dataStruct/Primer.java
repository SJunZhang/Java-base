package dataStruct;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:素数生成器
 * @author zsj
 * @date 2017年10月31日 下午8:09:20
 */
public class Primer {
	
	public static void main(String[] args) {
		int a = 100;
		for(int i=0;i<1000;i++){
			if(isPrimers(i)){
				System.out.println(i+"\t 是素数");
			}
		}
		
	}
	
	public static List<Integer> producePrimers(Integer a){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<1000;i++){
			if(isPrimers(i)){
				list.add(i);
			}
		}
		return list;
		
	}
	
	public static boolean isPrimers(int num){
		boolean flag = true;
		if(num>1){
			for(int i=2;i<Math.sqrt(num);i++){
				if(num%i==0){
					flag = false;
					break;
				}
			}
		}else{
			flag=false;
		}
		
		return flag;
	}

}
