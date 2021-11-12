
public class Ex011Test {
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = ex01;
		Ex01 ex03 = new Ex01();
		
		ex01.first = 30;
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		System.out.println(ex03.first);
		
		if(ex01 == ex02) {
			System.out.println("ex01과 ex02는 같은 객체이다.");
		}else {
			System.out.println("다른 객체이다.");
		}
		
		if(ex01 == ex03) {
			System.out.println("ex01과 ex03는 같은 객체이다.");
		}else {
			System.out.println("다른 객체이다.");
		}
		
		System.out.println("===============================");
		
		//static 키워드가 있는 멤버 변수는 객체 생성 없이 클래스명으로 사용할 수 있다.
//		Singleton s = Singleton.singleton;
		int result = Singleton.val;//private를 사용하게 되면 외부객체에서 객체내에있는 멤버에 직접접근할 수 없다.
		System.out.println(result);
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		if (s==s1) {
			System.out.println("s와 s1은 같은 객체이다.");
		}else {
			System.out.println("다른 객체이다.");
		}
	}
}
