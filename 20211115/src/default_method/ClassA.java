package default_method;

public abstract class ClassA {
	//�߻�޼ҵ�
	 public abstract void method01(); 
	 
	 //�Ϲݸ޼ҵ� : ���α׷��� �� ���������� �������� �޼ҵ尡 �ʿ��� ��� �߻�Ŭ�������� �Ϲݸ޼ҵ带 ����Ѵ�.
	 // �߻� �޼ҵ�� ������ �������̵� �Ͽ� �������ؾ���. �Ϲݸ޼ҵ�� �ʿ��� ��츸
	 public void method02() {
		System.out.println("ClassA-method02");
	}
}
