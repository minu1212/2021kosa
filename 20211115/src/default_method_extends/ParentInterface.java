package default_method_extends;

public interface ParentInterface {
	//abstract method
	public void method1() ;
	//default method
	public default void method2() {
		System.out.println("ParentInterface-method2");
	}
	
}
