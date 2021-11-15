package multi_implement;

public class SmartTelevision implements Searchable, RemoteControl {//다중상속
	int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnoff() {
		System.out.println("TV를 끕니다");
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

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

}
