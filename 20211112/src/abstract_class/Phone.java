package abstract_class;

//�߻�Ŭ���� : �߻�޼ҵ带 �������ִ� Ŭ����
public abstract class Phone {//�θ� Ŭ������ abstract��밡��
	public String owner;
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//���ǵǾ� ���� ���� �޼ҵ�
	public abstract void turnOn(); //�߻�޼ҵ�
	public abstract void turnOff();
}
