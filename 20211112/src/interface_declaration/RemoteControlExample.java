package interface_declaration;

public class RemoteControlExample {
	public static void main(String[] args) {
		/*
		Audio audio = new Audio();
		Television television = new Television();
		*/
		//������ : ���� �ϳ��� �������� ��ü ���.
		//����Ϸ��� Ŭ������ ������ ��ӹ��� �̿�
		
		RemoteControl r;//�������̿�
		r = new Audio();
		r.turnOn();
		r.turnOff();
		
		
		r = new Television();
		r.turnOn();
		r.turnOff();// = interface�� ������
				
	}
}
