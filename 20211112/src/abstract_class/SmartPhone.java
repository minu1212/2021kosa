package abstract_class;

//�߻�Ŭ������ ����ؼ� ����ϰ� �߻�޼ҵ带 �������ؼ� ����ؾ� �Ѵ�.
public class SmartPhone extends Phone{//�ڽ� Ŭ������ �߻�Ŭ������ ���� �Ұ�
	//�߻�Ŭ������ ����� ������ �߻� �޼ҵ带 ������ �Ͽ� ����Ѵ�.

	//�θ�Ŭ������ �����ڰ� ���� ��� �ڽ� Ŭ�������� �����ڸ� ���� �θ�Ŭ������ ������ �־�� �Ѵ�.
	public SmartPhone(String owner) {
		super(owner);
	}
	
	
	//�߻� �޼ҵ� ������
	@Override
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}

}
