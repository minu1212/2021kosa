
public class Ex12 {
	int first;
	int second;
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int add() {//������������ �޼ҵ�ȣ��θ� ����ϰ� �� ��� return ���� Ÿ������ �����Ͽ��� ��.
		return this.first + this.second;
	}
	public int sub() {
		return this.first - this.second;
	}
	public String getName() { //������ �����Ͽ� ����ϴ� ���� �ƴ� �޼ҵ带 ȣ���Ͽ� ���
		return "�̼���";
	}
}
