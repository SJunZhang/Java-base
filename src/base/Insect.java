package base;

public class Insect {
	private String color;

	public Insect(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 移动
	public void move() {
		System.out.println("moves");
	}

	// 攻击，攻击之前要移动
	public void attack() {
		move();
		System.out.println("attack");
	}

}
