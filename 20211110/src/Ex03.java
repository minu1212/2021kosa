
public class Ex03 { //static
	int first;
	int second;
	static int val;
	int val1;
	public int add(/*Ex03 this*/) {//��� �޼���
		return val + this.val1;
	}
	
	//instance ������ ����� �� ����, decause this�� ���� ���� ��� �޼ҵ忡�� ���Ǵ� �������� �� �� ���� ����
	public static int sub() {//static �޼ҵ�
//		return val - val1; // static �޼ҵ� �������� instance������ ����� �� ����.
//		return val - this.;
		return val;
	}
}
