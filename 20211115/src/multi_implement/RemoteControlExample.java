package multi_implement;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		Searchable sc = tv;
		RemoteControl rc = tv;
		//�θ� �ִ� �͸� ��� �����ϴ�.
		sc.search("�̼���");
		rc.turnOn();
		rc.turnoff();
		//��� ���� ��� ���� ����� �� �ִ�.
		tv.search("�̻��");
		tv.turnOn();
		tv.turnoff();
	}
}
