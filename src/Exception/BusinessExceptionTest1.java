package Exception;

public class BusinessExceptionTest1 {

	public static void a() throws BusinessException {
		System.out.println("function a");
		int a = 0;
		if (a == 0)
			throw new BusinessException("1");
	}

	public static void main(String[] args) {

		try {
			a();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
