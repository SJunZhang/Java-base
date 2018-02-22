package com.fiberhome.combination;

public class Combination {
	
	public static void main(String[] args) {
		Animal a=new Animal();
		a.breath();
		
		Bird b = new Bird(a);
		b.breath();
		b.fly();
		
		Lion l = new Lion(a);
		l.breath();
		l.run();
		
	}

}

class Animal{
	public void breath(){
		System.out.println("Animal must breath");
	}
}

class Bird{
	private Animal animal;
	public Bird(Animal animal) {
		this.animal = animal;
	}
	
	public void breath(){
		animal.breath();
	}
	
	public void fly(){
		System.out.println("bird can fly");
	}
}

class Lion{
	private Animal animal;
	
	public Lion(Animal animal){
		this.animal = animal;
	}
	
	public void breath(){
		animal.breath();
	}
	
	public void run(){
		System.out.println("i can run");
	}
}
