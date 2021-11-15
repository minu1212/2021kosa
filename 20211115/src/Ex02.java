
public class Ex02 extends Ex01{
	public  Ex02(int first) {
		super(first);
	}
	
	public void method2() {
//		추상클래스는 객체 생성을 할 수 없다, 객체생성을 한다 하더라도 사용할 수 없다.
//		Ex01 ex01 = new Ex01();
	}
//	추상메소드가 있는 추상 클래스를 상속하면 추상메서드는 오버라이딩을 해야한다.
	@Override
	public void method01() {
		System.out.println("Ex02-method1");
	}
}
