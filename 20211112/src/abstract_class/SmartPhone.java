package abstract_class;

//추상클래스는 상속해서 사용하고 추상메소드를 재정의해서 사용해야 한다.
public class SmartPhone extends Phone{//자식 클래스는 추상클래스로 선언 불가
	//추상클래스를 상속을 받으면 추상 메소드를 재정의 하여 사용한다.

	//부모클래스에 생성자가 있을 경우 자식 클래스에서 생성자를 통해 부모클래스로 전달해 주어야 한다.
	public SmartPhone(String owner) {
		super(owner);
	}
	
	
	//추상 메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
