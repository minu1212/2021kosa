package default_method_extends;

public class DefaultMethodExtendsExample {
	public static void main(String[] args) {
		ChildInterface1 c1 = new ChildInterface1() {

			// �߻�޼ҵ�
			@Override
			public void method1() {// �߻�޼ҵ� ������
				System.out.println("ParentInterface method1-������");// �θ� �������̽��� �߻� method1

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface1 method3-������");// �ڽ� �������̽��� �߻� method3

			}
		};
		c1.method1();
		c1.method2();//ParentInterface-method2
		c1.method3();

		ChildInterface2 c2 = new ChildInterface2() {

			@Override
			public void method1() {
				System.out.println("ParentInterface method1-������");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2-method3-������");
			}
		};
		c2.method1();
		c2.method2(); //ChildInterface2���� ������ �Ǿ�����
		c2.method3();

		ChildInterface3 c3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ParentInterface method1-������");

			}

			@Override
			public void method3() {
				System.out.println("ChildInterface3-method3-������");

			}

			@Override
			public void method2() {// default method�� �������̵��Ͽ� �߻�޼ҵ�� �ٲپ��־��� ������ �ݵ�� ������ �ؾ��Ѵ�.
				System.out.println("ChildInterface3-������ �� �߻� method2-������");
			}
			
			
			
			
		};
		c3.method1();
		c3.method2();//ChildInterface3���� default�޼ҵ带 �߻�޼ҵ�� ������ DefaultMethodExtendsExample���� �������� 
		c3.method3();///�߻�޼ҵ�
	}
}
