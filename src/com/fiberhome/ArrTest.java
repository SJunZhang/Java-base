package com.fiberhome;

import java.util.Arrays;

/**
 * @Description:java数组是引用传递
 * @author zsj
 * @date 2017年4月27日 下午4:38:15
 */
public class ArrTest {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3};
		int [] b =a;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		b[1]++;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
				
	}

}
