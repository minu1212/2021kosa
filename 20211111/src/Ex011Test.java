
public class Ex011Test {
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = ex01;
		Ex01 ex03 = new Ex01();
		
		ex01.first = 30;
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		System.out.println(ex03.first);
		
		if(ex01 == ex02) {
			System.out.println("ex01�� ex02�� ���� ��ü�̴�.");
		}else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		if(ex01 == ex03) {
			System.out.println("ex01�� ex03�� ���� ��ü�̴�.");
		}else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
		
		System.out.println("===============================");
		
		//static Ű���尡 �ִ� ��� ������ ��ü ���� ���� Ŭ���������� ����� �� �ִ�.
//		Singleton s = Singleton.singleton;
		int result = Singleton.val;//private�� ����ϰ� �Ǹ� �ܺΰ�ü���� ��ü�����ִ� ����� ���������� �� ����.
		System.out.println(result);
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		if (s==s1) {
			System.out.println("s�� s1�� ���� ��ü�̴�.");
		}else {
			System.out.println("�ٸ� ��ü�̴�.");
		}
	}
}
