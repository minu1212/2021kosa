
public class Ex02Test {
	public static void main(String[] args) {
		//final 변수는 생성자를 통해서 초기화가 가능
		Ex02 ex02 = new Ex02(10,20);//final변수가 있을 경우 무조건 값을 주어야한다.
		//초기화된 값을 변경하지 못한다. = 상수 여기서는 final변수
//		ex02.first = 20;
		
		//객체마다 final 변수의 값을 별개로 가질 수 있다.
		Ex02 ex021 = new Ex02(30,40);
		System.out.println(ex02.first);
		System.out.println(ex021.first);
	}
}
