package interface_extends;

//
public class ImplementationC implements interfaceC {// interfaceC�� A,B�� ��ӹ޾����Ƿ� C�� implement�� A,B,C��� �� ����� �����ϴ�

	@Override
	public void methodA() {
		System.out.println("implementationC-mthodA() ����");
	}

	@Override
	public void methodC() {
		System.out.println("implementationC-mthodC() ����");

	}

	@Override
	public void methodB() {
		System.out.println("implementationC-mthodB() ����");
		
	}

}
