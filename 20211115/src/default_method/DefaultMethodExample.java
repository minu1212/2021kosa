package default_method;

public class DefaultMethodExample {

	public static void main(String[] args) {
		
		//��ĳ���� 
		Myinterface mi1 = new MyClassA();
		mi1.method1();//������ O
		mi1.method2();//������ X MyInterface-method2 ����

		//��ĳ����
		Myinterface mi2 = new MyClassB();
		mi2.method1();//������ O
		mi2.method2();//������ O
	}

}
