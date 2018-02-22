package reflect;

class Bread{
	static{
		System.out.println("Load Class Bread");
	}
}

class Gum{
	static{
		System.out.println("load Class Gum");
	}
	
	public double price(){
		return 5.0;
	}
}

/**
 * @Description:用Class.forName()来实例化一个类
 * @author zsj
 * @date 2017年12月7日 下午3:45:26
 */
public class SweetShop {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Bread bread = new Bread();
		System.out.println("after bread");
		try {
			Object gumInstance = Class.forName("reflect.Gum").newInstance();
			System.out.println(((Gum)gumInstance).price());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
