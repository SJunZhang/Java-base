package ClassLoader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassLoaderTest1 {
	public static void main(String[] args) throws Exception {
		System.out.println(newInstanceCar().getBrand());

	}

	public static Car newInstanceCar() throws Exception {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		Class clazz = classLoader.loadClass("ClassLoader.Car");
		Constructor<Car> cons = clazz.getDeclaredConstructor();
		Car car = cons.newInstance();

		Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "red");

		return car;

	}

}
