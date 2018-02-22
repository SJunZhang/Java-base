package base.com;

public class BeanAttack implements Attack{
	
	private String move;
	private String attack;
	
	public BeanAttack(String move,String attack) {
		// TODO Auto-generated constructor stub
		this.move = move;
		this.attack = attack;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println(move);
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(attack);
	}

}
