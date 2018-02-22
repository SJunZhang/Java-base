package proxy.staticProxy;

public class Main {

	public static void main(String[] args) {
		ATarget atarget = new ATarget();
		BTarget btarget = new BTarget(atarget);
		btarget.save();
	}

}
