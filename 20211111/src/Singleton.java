
public class Singleton {
	int first;
	int second;
	
//싱글톤
/*	private*/static    int       val    = 10;  //private를 사용하게 되면 외부객체에서 객체내에있는 멤버에 직접접근할 수 없다. 내부에서는 접근이 가능하다.
	//자기 자신의 객체를 미리 만들어 놓고 사용( static을 사용하면 클래스명으로 사용가능한 것을 이용)
	private static Singleton singleton = new Singleton();  //static 키워드가 있는 멤버 변수는 객체 생성 없이 클래스명으로 사용할 수 있다.
	//singleton은 만들어지 객체의 주소를 담을 변수
	// private 생성자
	private Singleton() {}
	public static Singleton getInstance() { //자신의 객체(instance)를 전달하는 메소드
		return singleton;
	}
	//DB객체를 만들 때 주로 사용한다. 계속 생성하면 부하가 걸리기 때문에 
//======================================================================
	
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
