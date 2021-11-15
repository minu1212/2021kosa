package default_method;

public interface Myinterface {
	//추상메소드
	public void method1();
	
	//오버라이드를 할 수도 있고 안할수도 있는 메소드
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
