package base.com;

public class MainTest {
	public static void main(String[] args) {
		Attack attack = new BeanAttack("fly", "bite");
		
		ChinaBean bean = new ChinaBean("gold",attack);
		
		bean.move();
		bean.attack();
		
		
	}

}
