package default_method;

public interface Myinterface {
	//�߻�޼ҵ�
	public void method1();
	
	//�������̵带 �� ���� �ְ� ���Ҽ��� �ִ� �޼ҵ�
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
