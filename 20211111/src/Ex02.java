
public class Ex02 {
	//final 값이 변하지 않는 상수를 사용하고자 할 때
	final int first;
	final int second;
	String name;
	
	public Ex02(int first, int second) {
		this.first = first;
		this.second = second;
	}
	/*
	 *  final을 사용하면 setter를 통해서 값을 변경할 수 없다.
	  	public void setFirst() {
			this.first = first;
		}
	 */

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public int getFirst() {
		return this.first;
	}

	public int getSecond() {
		return this.second;
	}
	
	

	
}
