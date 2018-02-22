package base.com;

public class ChinaBean extends Insect implements Attack {
	private Attack attack;

	public ChinaBean(String color,Attack attack) {
		super(color);
		this.attack = attack;
	}

	@Override
	public void move() {
		attack.move();
		System.out.println("chianBean fly faster than other beans");
	}

	@Override
	public void attack() {
		attack.attack();
	}

}
