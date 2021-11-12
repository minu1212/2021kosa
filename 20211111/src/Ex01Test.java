
public class Ex01Test {//싱글톤 - 하나의 어플리케이션내에서 단 하나만 생성되는 객체,
//	생성자 앞에 private를 사용하여 외부에서의 접근을 막는다.new연산자 사용 X,클래스 자신의 타입으로 정적 필드 선언

	public static void main(String[] args) {//p244
		/*
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
		Ex01 ex03 = new Ex01();
		*/
		/*
		 * 클래스 변수1 = 클래스/getInstance()
		 */
	Singleton s1 = Singleton.getInstance(); //30000
	Singleton s2 = Singleton.getInstance(); //30000
	if(s1 == s2) {
		System.out.println("s1과  s2는 같다");
	}else {
		System.out.println("s1과 s2는 다르다");
	}
	
	}
}
