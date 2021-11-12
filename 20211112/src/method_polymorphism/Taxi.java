package method_polymorphism;

public class Taxi extends Vehicle{

	@Override //재정의 : Vehicle에서 사용되는 run()메소드의 내용을 사용하지 않고 재정의 하겠다.
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
