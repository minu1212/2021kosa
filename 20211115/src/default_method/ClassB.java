package default_method;

public class ClassB extends ClassA{
	public void method03() {
		System.out.println("ClassB-method03");
	}

	@Override//�߻�޼ҵ�
	public void method01() {
		System.out.println("ClassB-method01");
	}
	
	//�Ϲݸ޼ҵ� ������ X
}
