
public interface Ex03 {//interface�� abstract�� ���� �ʾƵ� class���Ϸ� �����Ͻÿ� �ڵ����� �ٴ´�.
	//���,�߻�޼ҵ尡 �����Ѵ�.
	
	//���(static final) 
	static final int FIRST = 10;
	
	//�߻�޼ҵ�
	public void method01(); 
	//�߻�޼ҵ带 �������ִ� �߻�Ŭ������ ��ü������ �� �� ����. = �����ڸ� ���������� �ʿ䰡 ����. = �����ڰ� ����.
	//�߻�޼ҵ带 ����Ѵ� .= �������̵��Ͽ� ����Ѵ�. = �Ϲݸ޼ҵ尡 ���� = �� ������ ���� ����ʵ尡 ����
	
	//�޼ҵ尡 �ϴ� ���� : �ܺη� ���� ����ʵ忡 ���� ���޹ްų�  
	//����ʵ忡 �ִ� ���� �ܺη� �����ϱ� ���ؼ� ���(setter,getter)
	
	//���� 8�̻���� �߰��� default method�� static method(���忡���� ������� �ʴ� ��찡 �� ����)
	default void method02() {//default �޼ҵ�� ���ǵǾ� �־�� �Ѵ�.
		System.out.println("default method");
	}
	
	static void method03() {
		System.out.println("static - method");
	}
}