
public class Ex05 {
	static int first; // ��������
	static int second;
	int val;//�������, instance���� , ��������
	static {//���������� �ʱ�ȭ �� �� �ִ�.
		first = 20;
		second = 10;
//		val = 10; instance������ static������ �ʱ�ȭ�� �� �� ����.
	}
	public static int add() {
		return first + second;
	}
	
}
