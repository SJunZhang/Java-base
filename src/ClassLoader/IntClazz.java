package ClassLoader;

public class IntClazz {
	public static void main(String[] args) {
		Class clazz = int.class;
		System.out.println(clazz.getName());
		Integer a = 1;
		Number b = new Integer(2);
		String c = "111";
		boolean isIn = a.getClass().isInstance(b);
		System.out.println(isIn);
	}

}
