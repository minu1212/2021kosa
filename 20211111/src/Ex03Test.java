import java.util.Scanner;

public class Ex03Test {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(Ex03.name);
		Ex03.name = "�����";
		System.out.println(Ex03.name);
		//��ü���� ���� �ʱ�ȭ�� �� �ִ�. �� �Ϲ� �ʱ�ȭ�� �ϸ� ���� �� �� ����.
		Ex03 ex03 = new Ex03(20,30);
		Ex03 ex031 = new Ex03(50,20);
		System.out.println(ex03.getVal1());
		System.out.println(ex031.getVal1());
		System.out.println("============");
		//����� ����ϴ� ���� : ��� ��ü���� ������� ���� ������ ���� ����ϱ� ���ؼ� 
		System.out.println(Ex03.first);
		System.out.println(Ex03.second);
	    System.out.println(Ex03.first);	
	    System.out.println(Ex03.second);	
	    
	    //finalŰ���带 ������ �־ ������ �� ����.
//	    ex03.first = 10;
	
	}
}
