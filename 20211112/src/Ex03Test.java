
public class Ex03Test {
	public static void main(String[] args) {
		Ex03 ex03 =  new Ex03(3, 3.141592, "�׽�Ʈ 1");
		
		System.out.println(ex03.subject);
		double d = ex03.area(); //�������̵� area()���
		System.out.println(d);
		
		d = ex03.area(Math.PI);	//�����ε� area()���
		System.out.println(d);
		System.out.println(Math.PI);
		
		d= ex03.area1(); //�θ� ������ �ִ� area()��� �޼ҵ� ���
		System.out.println(d);
	}
	
	
}
