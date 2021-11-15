package interface_extends;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();//interface A,B,C 사용가능
		interfaceA ia = impl;
		ia.methodA();
		interfaceB ib = impl;
		ib.methodB();
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
