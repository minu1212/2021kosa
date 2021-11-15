package rutime_exception;

public class MultiExceptionExample {// �������� ����
	static int data1 = 0;
	static int data2 = 0;

	public static void main(String[] args) {
		try {
			data1 = Integer.parseInt(args[0]);
			data2 = Integer.parseInt(args[1]);
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data1 / data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է°��� 2���� �ʿ��մϴ�.");
		} catch (ArithmeticException e) {
			if (data2 == 0)
				System.out.println(0);
			else
				System.out.println(data1 / data2);
		}

	}
}
