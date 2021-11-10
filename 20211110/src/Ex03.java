
public class Ex03 { //static
	int first;
	int second;
	static int val;
	int val1;
	public int add(/*Ex03 this*/) {//멤버 메서드
		return val + this.val1;
	}
	
	//instance 변수를 사용할 수 없음, decause this를 받지 못해 어느 메소드에서 사용되는 변수인지 알 수 없기 때문
	public static int sub() {//static 메소드
//		return val - val1; // static 메소드 내에서는 instance변수를 사용할 수 없다.
//		return val - this.;
		return val;
	}
}
