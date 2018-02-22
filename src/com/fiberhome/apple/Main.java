package com.fiberhome.apple;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ApplePredicate applePredicate = new AppleGreenColorPredicate();
		List<Apple> inventory = inventory();//存货的苹果
		List<Apple> greenAppleList = new ArrayList<>();
		greenAppleList = Filter.filterApples(inventory, applePredicate);
		for(Apple greenApple: greenAppleList){
			System.out.println("Apple color:"+greenApple.getColor()+",Apple Weight:"+greenApple.getWeight());
		}
	}
	
	private static List<Apple> inventory(){
		List<Apple> list = new ArrayList<>();
		Apple apple;
		for(int i=0;i<10;i++){
			apple = new Apple();
			apple.setColor("green");
			apple.setPrice(4d);
			apple.setSourth("huNan");
			apple.setWeight(Math.random()*10);
			list.add(apple);
		}
		for(int j=0;j<10;j++){
			apple = new Apple();
			apple.setColor("red");
			apple.setPrice(5d);
			apple.setSourth("huNan");
			apple.setWeight(Math.random()*10);
			list.add(apple);
		}
		return list;
	}

}
