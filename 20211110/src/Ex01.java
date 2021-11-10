
public class Ex01 {
	// 캡슐화(접근권한제어자로 외부 내부 접근권환을 구별)
	// 멤버필드, 멤버변수
	int first;
	int second;
	int result;

	public Ex01() {
		//default 생성자(기본생성자)
		//다른 생성자가 없는 경우 byte 코드 파일에 자동으로 생기는 생성자
		//다른 생성자가 있는 경우 default 생성자를 명시해 주어야 사용가능하다.
	}
	
	public Ex01(int first) {//생성자 오버로딩
		this.first = first;
		this.second = 20;
	}
	
	public  Ex01 (int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	// 메서드

	public void setFirst(int first) {
		this.first = first;
	}

	public int getFirst() {// 매개변수가 없는 경우 this를 생략이 가능하다
		return first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public int add() {//메소드 오버로딩
		return this.first + this.second; 
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public void add(int num1) {
		System.out.println(num1 + this.first);
	}

}
