package interface_declaration;

public class RemoteControlNoNameExample {
	public static void main(String[] args) {
		
		//interface는 객체를 생성할 수 없다. 따라서 자식클래스에서 상속받아 재정의하여 구현해 주어야 한다.
//		RemoteControl rc = new RemoteControl();
//		클래스에 상속시키지 않고 클래스명이 없는 익명 구현 객체로
		
		RemoteControl rc = new RemoteControl() {
			//필드
			int vol;
			
			
			@Override
			public void turnOn() {
				System.out.println("cd를 킵니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("cd를 끕니다.");
				
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
				System.out.println("현재 cd볼륨은 " + vol + "입니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
}
