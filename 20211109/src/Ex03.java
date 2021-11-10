
public class Ex03 {
	int first;// 멤버필드
	int second;
	int result;
	
	//	       python : self = this
	public void setData(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	//setter
	//this. first 값 지정하기
	public void setFirst(int first) {
		this.first = first;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	//getter
	//first 값 받아오기 first의 자료형 입력
	public int getFirst() {
		return this.first;
	}
	
	//second 값 받아오기 
	public int getSecond() {
		return this.second;
	}
	
	public void add() {
		this.result = this.first + this.second;
	}
	
	public void sud() {
		this.result = this.first - this.second;
	}
}
