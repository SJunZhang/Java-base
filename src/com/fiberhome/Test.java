package com.fiberhome;

public class Test {
	public static void main(String[] args) {
		
		InnerClassTest ict = new InnerClassTest();
		ict.output("hello");
		InnerClassTest.Inner inner = ict.new Inner();
		inner.input("hello");
	}

}
