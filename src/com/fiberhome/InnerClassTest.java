package com.fiberhome;

public class InnerClassTest {
	public static void main(String[] args) {
		InnerClassTest ict = new InnerClassTest();
		ict.output("hello out");
		InnerClassTest.Inner inner = ict.new Inner();
		inner.input("hello inner");
		
	}
	
	public void output(String str){
		System.out.println("Out class:"+str);
	}
	
	public class Inner{
		public void input(String str){
			System.out.println("Inner class:"+str);
		}
	}

}
