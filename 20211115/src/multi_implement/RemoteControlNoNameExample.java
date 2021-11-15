package multi_implement;

public class RemoteControlNoNameExample {
//익명구현 : 상속된 클래스명이 없이 사용, 클래스에 상속하지 않고 사용하겠다.
	
	
	public static void main(String[] args) {
		//인터페이스를 이용해서 객체생성시에 재정의하는 것
		RemoteControl rc = new RemoteControl() {//클래스를 상속하지 않고 객체생성과 동시에 재정의 할수있도록 함 = 익명구현
			int volume;
			
			@Override
			public void turnoff() {
				System.out.println("tv를 끄다");
			}
			
			@Override
			public void turnOn() {
				System.out.println("tv를 켜다");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {// 상수는 클래스명.상수명으로 사용
					this.volume = RemoteControl.MAX_VOLUME; // Max volume보다 큰값을 주엇더라도 max값으로 설정됨
				} else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 : " + this.volume);			
			}
		};
		rc.turnOn();
		rc.turnoff();
	
		
	}
}
