package polymorphism;

public class BTest {
	public static void main(String[] args) {
		B b = new B();
		A a = b;
		//자식객체 b를 a에 주더라도 A밖에 사용할 수 없다.
		a.method0();
		
		A a1 = new A();
	}
}
