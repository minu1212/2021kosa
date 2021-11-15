package default_method;

public abstract class ClassA {
	//추상메소드
	 public abstract void method01(); 
	 
	 //일반메소드 : 프로그래밍 시 선택적으로 재정의할 메소드가 필요할 경우 추상클래스에서 일반메소드를 사용한다.
	 // 추상 메소드는 무조건 오버라이드 하여 재정의해야함. 일반메소드는 필요할 경우만
	 public void method02() {
		System.out.println("ClassA-method02");
	}
}
