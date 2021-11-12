import java.util.Scanner;

public class Ex03Test {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(Ex03.name);
		Ex03.name = "이장범";
		System.out.println(Ex03.name);
		//객체마다 값을 초기화할 수 있다. 단 하번 초기화를 하면 변결 할 숭 없다.
		Ex03 ex03 = new Ex03(20,30);
		Ex03 ex031 = new Ex03(50,20);
		System.out.println(ex03.getVal1());
		System.out.println(ex031.getVal1());
		System.out.println("============");
		//상수를 사용하는 이유 : 모든 객체에서 변경되지 않은 동일한 값을 사용하기 위해서 
		System.out.println(Ex03.first);
		System.out.println(Ex03.second);
	    System.out.println(Ex03.first);	
	    System.out.println(Ex03.second);	
	    
	    //final키워드를 가지고 있어서 변경할 수 없다.
//	    ex03.first = 10;
	
	}
}
