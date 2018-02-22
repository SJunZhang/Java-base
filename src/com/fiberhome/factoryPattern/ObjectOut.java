package com.fiberhome.factoryPattern;

import java.util.Arrays;

public class ObjectOut {
	private static int []a={1,2,3};
	private String s="he";
	
	public int [] getArr(){
		return a;
	}
	
	public static void main(String[] args) {
		new ObjectOutOperation().test1();
		System.out.println(Arrays.toString(a));
	}

}
