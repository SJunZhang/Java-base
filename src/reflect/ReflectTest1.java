package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest1 {
	
	public static void main(String[] args) {
		Field[] fields = Org.class.getDeclaredFields();
		Method[] methods = Org.class.getMethods();
		for(int i=0;i<fields.length;i++){
			//System.out.println(fields[i].getType().getSimpleName()+" "+fields[i].getName());
		}
		
		Org simpleOrg=new Org();
		Method m1;
		try {
			m1 = Org.class.getMethod("setFiled1", String.class);
			try {
				m1.invoke(simpleOrg, "11");
				System.out.println(simpleOrg.getFiled1());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for(int j=0;j<methods.length;j++){
			String methodName = methods[j].getName();
			//System.out.println(methodName);
		}
		
		try {
			Org org = Org.class.newInstance();
			//System.out.println(org.getClass().getName());
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void getMethods(Class<?> clazz){
		Method[] methods = clazz.getMethods();
		for(int j=0;j<methods.length;j++){
			String methodName = methods[j].getName();
			System.out.println(methodName);
		}
	}

}
