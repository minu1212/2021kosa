package default_method_extends;

public class DefaultMethodExtendsExample {
	public static void main(String[] args) {
		ChildInterface1 c1 = new ChildInterface1() {

			// 추상메소드
			@Override
			public void method1() {// 추상메소드 재정의
				System.out.println("ParentInterface method1-재정의");// 부모 인터페이스의 추상 method1

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface1 method3-재정의");// 자식 인터페이스의 추상 method3

			}
		};
		c1.method1();
		c1.method2();//ParentInterface-method2
		c1.method3();

		ChildInterface2 c2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ParentInterface method1-재정의");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2-method3-재정의");
			}
		};
		c2.method1();
		c2.method2(); //ChildInterface2에서 재정의 되어있음
		c2.method3();

		ChildInterface3 c3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ParentInterface method1-재정의");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface3-method3-재정의");

			}

			@Override
			public void method2() {// default method를 오버라이드하여 추상메소드로 바꾸어주었기 때문에 반드시 재정의 해야한다.
				System.out.println("ChildInterface3-재정의 한 추상 method2-재정의");
			}
			
			
			
			
		};
		c3.method1();
		c3.method2();//ChildInterface3에서 default메소드를 추상메소드로 재정의 DefaultMethodExtendsExample에서 재정의함 
		c3.method3();///추상메소드
	}
}
