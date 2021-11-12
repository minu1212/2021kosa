package multi_implement;

import interface_declaration.RemoteControl;

public class SmartTelevision implements RemoteControl,Searchable {//인터페이스는 다중상속이 가능하다.
	//필드
	private int volume;

	
	
	@Override
	public void turnOn() {
		System.out.println("Television를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Television를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		//정의할 내용이 없을 경우 내용을 적지 않아도 정의된 것으로 처리 됨
		
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}
	
}
