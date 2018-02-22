package base;

public class Bean extends Insect{
	public Bean(String color) {
		// TODO Auto-generated constructor stub
		super(color);
	}
	
	public void move(){
		System.out.println("fly");
	}
	
	public void attack(){
		move();
		super.attack();
	}
	

}
