package ClassLoader;

public class ATest {
	
	public void aTest(){
		Class clazz = this.getClass();
		System.out.println(clazz.getName());
	}
	
	public static void main(String[] args) {
		ATest atest = new ATest();
		atest.aTest();
	}

}
