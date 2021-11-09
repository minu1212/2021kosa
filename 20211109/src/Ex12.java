
public class Ex12 {
	int first;
	int second;
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int add() {//변수지정없이 메소드호출로만 사용하게 될 경우 return 값의 타입으로 선언하여야 함.
		return this.first + this.second;
	}
	public int sub() {
		return this.first - this.second;
	}
	public String getName() { //변수를 지정하여 사용하는 것이 아닌 메소드를 호출하여 사용
		return "이숭무";
	}
}
