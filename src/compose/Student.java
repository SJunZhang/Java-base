package compose;

/**
 * @Description:组合就是已经存在一个类，我要要用到该类的方法，直接在本类里面把实例依赖进来，然后组合该类的方法，加强本类的行为
 * @author zsj
 * @date 2017年11月17日 下午2:35:06
 */
public class Student {
	private People people;
	public Student(People people) {
		// TODO Auto-generated constructor stub
		this.people = people;
	}
	
	public void say(){
		people.say();
	}
	
	public void eat(){
		people.eat();
	}
	
	public void study(){
		System.out.println("student study");
	}

}
