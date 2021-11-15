package default_method;

public class ClassB extends ClassA{
	public void method03() {
		System.out.println("ClassB-method03");
	}

	@Override//추상메소드
	public void method01() {
		System.out.println("ClassB-method01");
	}
	
	//일반메소드 재정의 X
}
