package default_method_extends;

public interface ChildInterface2 extends ParentInterface{
	@Override//��ӹ��� default method ������
	public default void method2() {
		System.out.println("ChildInterface2-method2");
	}
	public void method3();
}
