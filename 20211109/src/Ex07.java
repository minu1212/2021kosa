
public class Ex07 {
	int first;
	int second;
	int result;
	
	//������
	public Ex07(int first, int second) {
		this.first = first;
		this.second = second;
	}	
	
	//�����ڰ� �ٸ� �����ڸ� ����� defalt(�⺻) �����ڴ� �ڵ����� ��������� �ʴ´�. 
    // = �����ڸ� ������� ��� defalt �����ڴ� ��������� ������־�� �Ѵ�.
	// = �����ڸ� ������ �ʾ��� ��� defalt �����ڴ� �Ͻ������� �����Ѵ�.
	public Ex07() {
		System.out.println("dafalt ������ ����");
	}//defalt(�⺻) ������ 



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
	
	//���ϱ�
	public void add() {
		this.result = this.first + this.second;
	}
	
	//����
	public void sud() {
		this.result = this.first - this.second;
	}
}
