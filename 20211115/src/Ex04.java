
public class Ex04 implements Ex03{//interface는 다중상속이 가능하다

	//추상메소드 사용 시 오버라이드 해주어야 한다.
	@Override
	public void method01() {
		System.out.println("Ex04-method");
	}

}
