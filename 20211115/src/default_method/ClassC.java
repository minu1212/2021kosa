package default_method;

public class ClassC extends ClassA {
	public void method04() {
		System.out.println("ClassC - method04");
	}

	@Override//추상메소드
	public void method01() {
		// TODO Auto-generated method stub

	}

	@Override//일반메소드
	public void method02() {
		System.out.println("ClassC - method02");
	}
}
