package default_method_extends;

public interface ChildInterface3 extends ParentInterface{
	public void method3();	
	
	@Override
	public void method2();
	//상속받은 default메소드를 추상 메소드로 오버라이드하여 꼭 재정의하도록 만듦
}
