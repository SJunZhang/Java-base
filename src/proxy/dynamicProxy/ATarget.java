package proxy.dynamicProxy;

public class ATarget implements Target {
	public void save() {
		System.out.println("ATarget Save function");
	}
}

interface Target {
	void save();
}
