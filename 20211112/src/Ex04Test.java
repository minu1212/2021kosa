
public class Ex04Test {
	public static void main(String[] args) {
		B b = new B();	//A
		C c = new C(); 	//A
		D d = new D(); 	//A,B
		E e = new E();	//A,C
		//������ : �θ�� �ڽ� ��ü�� ���� �� �� �ִ�.(= �ڽ��� �θ𿡰� ��ӵǾ��־�� �����ϴ�.)
		// �ϳ��� ���������� ���¸� ���� �� �ִ� ��
		A a = b;//a�� b�� �Ǿ���.
		a = c;	//a�� c�� �Ǿ���.
		a = d; 	//a�� d�� �Ǿ���.
		a = e; 	//a�� e�� �Ǿ���.
	}
}
