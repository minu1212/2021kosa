
public class Ex01Test {
	public static void main(String[] args) {
		//객체생성과 멤버필드의 초기화를 동시에
		Ex01 ex01 = new Ex01(20,10);//ex01객체생성
		int result = ex01.add(); //객체 내에 있는 함수를 외부에서 사용 : 객체명.메소드
		System.out.println(result);
		result = ex01.add(30, 10);
		System.out.println(result);
	}
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
