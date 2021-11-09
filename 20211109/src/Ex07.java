
public class Ex07 {
	int first;
	int second;
	int result;
	
	//생성자
	public Ex07(int first, int second) {
		this.first = first;
		this.second = second;
	}	
	
	//개발자가 다른 생성자를 만들면 defalt(기본) 생성자는 자동으로 만들어지지 않는다. 
    // = 생성자를 만들었을 경우 defalt 생성자는 명시적으로 만들어주어야 한다.
	// = 생성자를 만들지 않았을 경우 defalt 생성자는 암시적으로 존재한다.
	public Ex07() {
		System.out.println("dafalt 생성자 실행");
	}//defalt(기본) 생성자 



	//setter
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void result(int result) {
		this.result = result;
	}
	
	//getter
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
	public int getResult() {
		return this.result;
	}
	
	//더하기
	public void add() {
		this.result = this.first + this.second;
	}
	
	//빼기
	public void sud() {
		this.result = this.first - this.second;
	}
}
