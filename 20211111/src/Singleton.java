
public class Singleton {
	int first;
	int second;
	
//�̱���
/*	private*/static    int       val    = 10;  //private�� ����ϰ� �Ǹ� �ܺΰ�ü���� ��ü�����ִ� ����� ���������� �� ����. ���ο����� ������ �����ϴ�.
	//�ڱ� �ڽ��� ��ü�� �̸� ����� ���� ���( static�� ����ϸ� Ŭ���������� ��밡���� ���� �̿�)
	private static Singleton singleton = new Singleton();  //static Ű���尡 �ִ� ��� ������ ��ü ���� ���� Ŭ���������� ����� �� �ִ�.
	//singleton�� ������� ��ü�� �ּҸ� ���� ����
	// private ������
	private Singleton() {}
	public static Singleton getInstance() { //�ڽ��� ��ü(instance)�� �����ϴ� �޼ҵ�
		return singleton;
	}
	//DB��ü�� ���� �� �ַ� ����Ѵ�. ��� �����ϸ� ���ϰ� �ɸ��� ������ 
//======================================================================
	
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
