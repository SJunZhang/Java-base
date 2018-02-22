package Exception;

/**
 * @Description:在main方法中f()函数的异常信息丢失了，只是简单的被finally中g()的异常信息替换了。
 * @author zsj
 * @date 2017年10月28日 上午10:49:19
 */
public class ExceptionDestroyExample {
	public void f() throws VeryImportException {
		System.out.println("f()");
		throw new VeryImportException();
	}

	public void g() throws HumanException {
		System.out.println("g()");
		throw new HumanException();
	}

	public static void main(String[] args) throws Exception {
		ExceptionDestroyExample ede = new ExceptionDestroyExample();
		try {
			ede.f();
		} finally {
			ede.g();
		}

	}

}

class VeryImportException extends Exception {
	public VeryImportException() {
		// TODO Auto-generated constructor stub
		super();
	}
}

class HumanException extends Exception {
	public HumanException() {
		// TODO Auto-generated constructor stub
		super();
	}
}