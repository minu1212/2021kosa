
public class Ex14 {
	//Ŭ����(��ü) ���ο����� "�ʵ��̸�"���� �ٷ����� - Ex13Test
	//Ŭ����(��ü) �ܺο����� "����.�ʵ��̸�"���� ����
	int result;
	int first;
	int second;
	int add; //���� (= add()�� �Լ� �̴�. java������ ()�� �����ϱ� ������ �����̸��� �Լ��� ������ �����Ҽ������� python�� �Ұ�)
	//this �� ���� �̸��� ���ٸ� ���� �Ű������̰� ����ʵ������� �����Ҽ� ���Եȴ�.(�̸��� �ٸ��ٸ� this�� ������� �ʾƵ� �ȴ�.)
	
	/*
	public Ex14(int first, int second) {
		first = first;
		second = second;
	}
	
	public Ex14(int num1, int num2) {
		first = num1;
		second = num2;
	}
	*/
	
	// �޼ҵ�(Method)�� 4���� ����
	
	

	public Ex14(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	//1.I1O1 �Է°��� �ְ�(=�Ű������� �ִ�.) ��°�(=��ȯ���� �ִ�.= return�� �Ѵ�.)�� �ִ� �޼ҵ�
	public int add(int num1 ,int num2) {
		return num1 + num2 ;
	}
	
	//2.I1O0 �Է°��� �ְ�(=�Ű������� �ִ�.) ��°��� ����(=��ȯ���� ���� = void = return�� ���� �ʴ´�.) �޼ҵ�
	public void sub(int num1, int num2) {
		this.result = num1 - num2;
		System.out.println(this.result);
	}
	
	//3.I0O1 �Է°��� ����(=�Ű������� ����.=�Է°��� ��򰡿��� �����ؾ��Ѵ�.) ��°��� �ִ�(=��ȯ���� �ִ� = return�� �Ѵ�.) �޼ҵ�
	public int mul() {
		return this.first * this.second;
	}
	
	//4.I0O0 �Է°��� ����(=�Ű������� ����.) ��°��� ����(=��ȯ���� ����. = return�� ���� �ʴ´�.) �Լ�
	public void div() {
		// �޼ҵ� ȣ��ÿ� �����Ͽ� div�޼ҵ���� �ڵ带 ������ �� �����ڷ� �޾ƿ� �� ���
		System.out.println( this.first/this.second );
	}
	
	// ====================================================================================================
	
	//�޼ҵ� �����ε�(Method Overloading) (�޼ҵ��� �̸��� ������ �Ű������� Ÿ��,����,������ �ٸ� ������ �����Ͽ� ȣ��.)
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	
	/*
	public void sub(double num1, int num2) {// O
		this.result = num1 - num2;
	}
	
	public void sub(int num1, double num2) {// O
		this.result = num1 - num2;
	}
	*/
	
	//��ȯ���� �ٸ� ���� �ƴ� �Ű������� �޶����.
	/*
	public int sub(int num1, int num2) {// X
		return 0;
	}
	public int div(int num2, int num1) {// X - Ÿ���� ������ �Ű������� �̸��� �ٸ��ٰ� �ؼ� �����ε��̶�� ��������.
		return num1 / num2;
	}
	*/
}
