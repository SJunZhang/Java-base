package compose;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People();
		Student s1 = new Student(p1);
		s1.eat();
	}

}
