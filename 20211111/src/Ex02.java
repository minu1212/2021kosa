
public class Ex02 {
	//final ���� ������ �ʴ� ����� ����ϰ��� �� ��
	final int first;
	final int second;
	String name;
	
	public Ex02(int first, int second) {
		this.first = first;
		this.second = second;
	}
	/*
	 *  final�� ����ϸ� setter�� ���ؼ� ���� ������ �� ����.
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
