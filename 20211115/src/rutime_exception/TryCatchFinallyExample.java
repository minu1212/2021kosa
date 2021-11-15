package rutime_exception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		Point1 point = null; // Point point = new Point();

		try {
			point.print();

		} catch (NullPointerException e) {
			point = new Point1();
			point.print();

		} finally {
			System.out.println("���α׷��� ���������� ���� ���Դϴ�");
		}

	}
}

class Point1 {
	public void print() {
		System.out.println("���");
	}
}