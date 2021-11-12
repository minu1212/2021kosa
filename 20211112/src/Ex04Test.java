
public class Ex04Test {
	public static void main(String[] args) {
		B b = new B();	//A
		C c = new C(); 	//A
		D d = new D(); 	//A,B
		E e = new E();	//A,C
		//다형성 : 부모는 자식 객체를 참조 할 수 있다.(= 자식이 부모에게 상속되어있어야 가능하다.)
		// 하나가 여러가지의 형태를 가질 수 있는 것
		A a = b;//a가 b가 되었다.
		a = c;	//a가 c가 되었다.
		a = d; 	//a가 d가 되었다.
		a = e; 	//a가 e가 되었다.
	}
}
