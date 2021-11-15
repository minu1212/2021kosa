package default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		
		//업캐스팅 
		Myinterface mi1 = new MyClassA();
		mi1.method1();//재정의 O
		mi1.method2();//재정의 X MyInterface-method2 실행

		//업캐스팅
		Myinterface mi2 = new MyClassB();
		mi2.method1();//재정의 O
		mi2.method2();//재정의 O
	}

}
