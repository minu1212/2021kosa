
public class Ex01Test {
	public static void main(String[] args) {
		//��ü������ ����ʵ��� �ʱ�ȭ�� ���ÿ�
		Ex01 ex01 = new Ex01(20,10);//ex01��ü����
		int result = ex01.add(); //��ü ���� �ִ� �Լ��� �ܺο��� ��� : ��ü��.�޼ҵ�
		System.out.println(result);
		result = ex01.add(30, 10);
		System.out.println(result);
	}
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
