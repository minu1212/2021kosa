package multi_implement;

public class RemoteControlNoNameExample {
//�͸��� : ��ӵ� Ŭ�������� ���� ���, Ŭ������ ������� �ʰ� ����ϰڴ�.
	
	
	public static void main(String[] args) {
		//�������̽��� �̿��ؼ� ��ü�����ÿ� �������ϴ� ��
		RemoteControl rc = new RemoteControl() {//Ŭ������ ������� �ʰ� ��ü������ ���ÿ� ������ �Ҽ��ֵ��� �� = �͸���
			int volume;
			
			@Override
			public void turnoff() {
				System.out.println("tv�� ����");
			}
			
			@Override
			public void turnOn() {
				System.out.println("tv�� �Ѵ�");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {// ����� Ŭ������.��������� ���
					this.volume = RemoteControl.MAX_VOLUME; // Max volume���� ū���� �־����� max������ ������
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("���� TV ���� : " + this.volume);			
			}
		};
		rc.turnOn();
		rc.turnoff();
	
		
	}
}
