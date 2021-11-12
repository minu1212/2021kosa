package interface_declaration;

public interface RemoteControl {
	//추상메소드 객체생성X = 생성자 X, 필드 X, 일반메소드 X, 
	
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드(abstract method)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//자바 8버전부터 추가 ----------------------------
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리를 하겠습니다.");	
		}else {
			System.out.println("무음 해제를 한다.");
		}
		
	}
	
	//정적 메소드
	static void changeBattery(){
		System.out.println("건전지를 교환합니다.");
	}
}
