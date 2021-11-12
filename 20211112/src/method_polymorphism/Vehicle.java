package method_polymorphism;

public abstract class Vehicle {//추상 클래스
	
	//재정의 : 오버라이드 시 Vehicle에서 사용되는 run()메소드의 내용을 사용하지 않고 재정의 함으로. 
	//	내용을 적을 필요가 없다  = abstract method를 사용하여 자식클래스에서 오버라이드하여 재정의하여 사용할 수 있도록 한다.
	public abstract void run();//추상메소드
	//부모클래스에 있는 메소드의 내용을 사용하지 않고
	//자식 클래스에서 재정의하여 사용하므로 부모클래스에 있는 메서드 내용이 필요 없어서 내용이 없는 메소드를 만들었다.
	
	
}