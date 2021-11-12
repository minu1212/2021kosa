package multi_implement;

public interface Searchable {//인터페이스는 abstract를 적지 않아아도 byte코드 컴파일시에 class 파일에서 자동으로 붙어진다.
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void search(String url);
	
	
	
}
