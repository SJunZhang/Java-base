package proxy.staticProxy;

public class BTarget implements ITarget {

	private ITarget target;

	public BTarget(ITarget target) {
		// TODO Auto-generated constructor stub
		this.target = target;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Before");
		this.target.save();
		System.out.println("After");

	}
}
