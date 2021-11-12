package interface_declaration;

public class RemoteControlNoNameExample {
	public static void main(String[] args) {
		
		//interface�� ��ü�� ������ �� ����. ���� �ڽ�Ŭ�������� ��ӹ޾� �������Ͽ� ������ �־�� �Ѵ�.
//		RemoteControl rc = new RemoteControl();
//		Ŭ������ ��ӽ�Ű�� �ʰ� Ŭ�������� ���� �͸� ���� ��ü��
		
		RemoteControl rc = new RemoteControl() {
			//�ʵ�
			int vol;
			
			
			@Override
			public void turnOn() {
				System.out.println("cd�� ŵ�ϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("cd�� ���ϴ�.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					vol = RemoteControl.MAX_VOLUME;
				}else if(volume < RemoteControl.MIN_VOLUME) {
					vol = RemoteControl.MIN_VOLUME;
				}else {
					vol = volume;
				}
				System.out.println("���� cd������ " + vol + "�Դϴ�.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
}
