package rutime_exception;

public class ThrowsExample {// �����߻� �ΰ� (������, ȣ���Լ�)

	public static void main(String[] args) {
		try {
			test();//ȣ���Լ�
		} catch (ArithmeticException e) {
			System.out.println(0);
		}
	}
	
	//ȣ���Լ� ������ ���ܸ� ������ ������ throws�����ڸ� ����ؾ� �Ѵ�.
	public static void test() throws ArithmeticException {//thorws : ȣ���Լ������� ������ ������.
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
