
public class Ex06Test {
	public static void main(String[] args) {// ����ʵ��� �ʱ�ȭ 2���� ���, setter,������(Ŭ�����̸��� �����ϰ� ����)
//		Ex06 ex06 = new Ex06();
		//�������� 
		Ex06 ex06;
		
		//��ü����
		ex06 = new Ex06(); 
		
		//��� �ʵ��� �ʱ�ȭ
		ex06.setDate("�̼���", 35, 175.5);//setter
		String name = ex06.getName();//getter
		
		//��� �ʵ� �� ��������
		System.out.println(name);
		
		//��ü������ ���ÿ� ����ʵ� �ʱ�ȭ�ϱ� : ������(Ŭ�����̸��� �����ϰ�)
//	    ��������(Ex061) + ��ü����(ex061) + ����ʵ��� �ʱ�ȭ("�̼���", 35, 175.5)
		Ex061  ex061 = new Ex061("�̼���", 35, 175.5);
		
		//��ü �����ÿ�  �����ڰ� �ڵ����� ����.
		System.out.println(ex061.getAge()); //this.age�� ���
		
		
	}
}
