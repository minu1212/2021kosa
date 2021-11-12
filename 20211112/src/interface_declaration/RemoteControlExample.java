package interface_declaration;

public class RemoteControlExample {
	public static void main(String[] args) {
		/*
		Audio audio = new Audio();
		Television television = new Television();
		*/
		//다형성 : 변수 하나로 여러개의 객체 사용.
		//사용하려는 클래스의 공통점 상속받음 이용
		
		RemoteControl r;//다형성이용
		r = new Audio();
		r.turnOn();
		r.turnOff();
		
		
		r = new Television();
		r.turnOn();
		r.turnOff();// = interface의 다형성
				
	}
}
