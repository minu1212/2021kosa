package interface_declaration;

public interface RemoteControl {
	//�߻�޼ҵ� ��ü����X = ������ X, �ʵ� X, �Ϲݸ޼ҵ� X, 
	
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�(abstract method)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//�ڹ� 8�������� �߰� ----------------------------
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���� �ϰڽ��ϴ�.");	
		}else {
			System.out.println("���� ������ �Ѵ�.");
		}
		
	}
	
	//���� �޼ҵ�
	static void changeBattery(){
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
