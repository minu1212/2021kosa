package rutime_exception;

public class ThrowsExample {// 에러발생 두곳 (진원지, 호출함수)

	public static void main(String[] args) {
		try {
			test();//호출함수
		} catch (ArithmeticException e) {
			System.out.println(0);
		}
	}
	
	//호출함수 쪽으로 예외를 돌려줄 때에는 throws연산자를 사용해야 한다.
	public static void test() throws ArithmeticException {//thorws : 호출함수쪽으로 오류를 던진다.
		int i = 2;
		int j = 0;
		System.out.println(i / j);
		/*
		 * try { System.out.println(i / j); 
		 * } catch (ArithmeticException e) {
		 * System.out.println(0); }
		 */
	}
}
