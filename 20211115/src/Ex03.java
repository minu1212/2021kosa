
public interface Ex03 {//interface는 abstract를 적지 않아도 class파일로 컴파일시에 자동으로 붙는다.
	//상수,추상메소드가 존재한다.
	
	//상수(static final) 
	static final int FIRST = 10;
	
	//추상메소드
	public void method01(); 
	//추상메소드를 가지고있는 추상클래스는 객체생성을 할 수 없다. = 생성자를 가지고있을 필요가 없다. = 생성자가 없다.
	//추상메소드를 사용한다 .= 오버라이딩하여 사용한다. = 일반메소드가 없다 = 값 전달을 위한 멤버필드가 없다
	
	//메소드가 하는 역할 : 외부로 부터 멤버필드에 값을 전달받거나  
	//멤버필드에 있는 값을 외부로 전달하기 위해서 사용(setter,getter)
	
	//버전 8이상부터 추가된 default method와 static method(현장에서는 사용하지 않는 경우가 더 많음)
	default void method02() {//default 메소드는 정의되어 있어야 한다.
		System.out.println("default method");
	}
	
	static void method03() {
		System.out.println("static - method");
	}
}