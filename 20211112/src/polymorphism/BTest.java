package polymorphism;

public class BTest {
	public static void main(String[] args) {
		B b = new B();
		A a = b;
		//�ڽİ�ü b�� a�� �ִ��� A�ۿ� ����� �� ����.
		a.method0();
		
		A a1 = new A();
	}
}
