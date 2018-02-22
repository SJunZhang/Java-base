package Exception;

public class Exception1 {
	public static void test1() {
		try {
			test6();
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("除数不能为0");
		}catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("数组下标溢出");
		}finally {
			System.out.println("test1 finally");
		}
		System.out.println("test1 the code out try");
	}

	private static void test6() {
		int i = 12 / 0;
		System.out.println(i);
		System.out.println("test1 the next code in try");
		int a[] = {1,2};
		System.out.println(a[3]);
	}

	public static void test4() {
		try {
			int i = 12 / 0;
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ArithmeticException();
		}
	}

	public static void test2() {
		int a = 12, b = 0, c;
		if (b == 0)
			throw new ArithmeticException();
		c = a / b;
	}

	public static void test3() throws ArithmeticException {
		int a = 12, b = 0, c;
		c = a / b;
	}

	public static void main(String[] args) {
		try {
			test1();
			System.out.println("main the next code in try");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getCause();
		}finally {
			System.out.println("finally in main");
		}
		System.out.println("abc");
	}

}
