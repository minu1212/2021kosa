
public class Ex03 {
	int first;// ����ʵ�
	int second;
	int result;
	
	//	       python : self = this
	public void setData(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	//setter
	//this. first �� �����ϱ�
	public void setFirst(int first) {
		this.first = first;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	//getter
	//first �� �޾ƿ��� first�� �ڷ��� �Է�
	public int getFirst() {
		return this.first;
	}
	
	//second �� �޾ƿ��� 
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
