package proxy.dynamicProxy;

public class Main {
	public static void main(String[] args) {
		Target atarget = new ATarget();
		Object pt = new ProxyTarget(atarget).getProxyInstance();
		((Target) pt).save();
	}
}
