package pattern;

public class SingletonPattern {
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.newInstanceSingleton();
		System.out.println(s1.getI());
		
	}

}

class Singleton{
	private int i;
	private static Singleton singleton = new Singleton(47);
	private Singleton(int i){
		this.i = i;
	}
	
	public static Singleton newInstanceSingleton(){
		return singleton;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
