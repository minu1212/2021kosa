package interface_extends;

//
public class ImplementationC implements interfaceC {// interfaceC는 A,B를 상속받았으므로 C를 implement시 A,B,C모두 다 상속이 가능하닫

	@Override
	public void methodA() {
		System.out.println("implementationC-mthodA() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("implementationC-mthodC() 실행");

	}

	@Override
	public void methodB() {
		System.out.println("implementationC-mthodB() 실행");
		
	}

}
