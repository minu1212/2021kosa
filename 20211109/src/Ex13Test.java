import java.security.PublicKey;
import java.util.Iterator;

public class Ex13Test {
	public static void main(String[] args) {
		/*
		// 6�� ���
		for (int i = 1; i <= 9; i++) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		// 8�� ���
		for (int i = 1; i <= 9; i++) {
			System.out.println("8 * " + i + " = " + 8 * i);
		}
		// 3�� ���
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		*/
		
		gugu(3); //gugu(argument : ����)
		gugu(6);
		gugu(7);
		
		System.out.println("==================");
		
		/*
		int result = 10 + 3;
		System.out.println(result);
		result = 30 + 5;
		System.out.println(result);
		*/ // ��
		//��ȯ���� (int)�� �ִ� �޼ҵ�
		int result = add(10,3);
		System.out.println(result);
		//��ü����
		int result1 = add(30,10);
		System.out.println(result1);
	}
	//�ݺ������� ����ϴ� �ڵ尡 �ִٸ� �Լ��� ���� ����ϴ� ���� �� ����.
//							dan : parameter : �Ű�����
	public static void gugu(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+" * " + i + " = " + dan * i);
		}
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
}
