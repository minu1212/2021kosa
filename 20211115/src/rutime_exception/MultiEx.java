package rutime_exception;

public class MultiEx {


	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;
		try {
			data1 = Integer.parseInt(args[0]);
			data2 = Integer.parseInt(args[1]);
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data1 / data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է°��� 2���� �ʿ��մϴ�.");
		} catch (Exception e) {//Exception�� ���� Ŭ������ �θ� Ŭ���� ��� ������ ��´�. ���� ���ܵ��� Exception���� ���� �ۼ��Ͽ��� ����ó���� �����ϴ�.
			if (data2 == 0)
				System.out.println(0);
			else
				System.out.println(data1 / data2);
		}

	}
}


