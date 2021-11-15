package interface_extends;

//interface에서 interface를 extends 할때는 다중상속이 가능하다
public interface interfaceC extends interfaceA, interfaceB {// interface간에는 extend(확장)의 개념 뿐이다.
	public void methodC();
}
