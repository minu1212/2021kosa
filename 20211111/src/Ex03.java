
public class Ex03 {
	static String name;//��������(��������, Ŭ��������) : ��� ��ü�� ���� �����ؼ� ����ϱ� ���ؼ�
	//�������� �ʱ�ȭ : static �� 
	//���
	static final int first;
	static final int second;
	//final ���� : ��ü���� ������ ���� ���� �� �ִ�. �����ڸ� �̿��ؼ� �ʱ�ȭ�Ѵ�.
	final int val1;
	final int val2;
	
	static {
		name = "�̼���";
		first = 10;
		second = 5;
	}

	public Ex03(int val1, int val2) {
		super();
		this.val1 = val1;
		this.val2 = val2;
	}

	public static String getName() {
		return name;
	}

	public static int getFirst() {
		return first;
	}

	public static int getSecond() {
		return second;
	}

	public int getVal1() {
		return val1;
	}

	public int getVal2() {
		return val2;
	}

	
}
