
public class Ex03 extends Ex02{//�ڽ�Ŭ���� ���, �޼ҵ�������̵�/�ε�
	String subject;
	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}
	
	@Override
	public double area() {//�޼ҵ� �������̵�  - �θ�Ŭ������ ��ӹ��� �޼ҵ带 �ڽ�Ŭ�������� ������
		return radius * radius * Math.PI;
	}
	
	public double area(double p) {//�޼ҵ� �����ε�
		return radius * radius * p;
	}
	
	public double area1() {//�θ�Ŭ������ area()���
		return super.area();
	}
}
