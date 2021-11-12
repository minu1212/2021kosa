package method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
//		Vehicle vehicle = new Vehicle();
		//new연산자로 객체를 생성하지 못하고 상속을 통해 자식 클래스만 생성이 가능하다.
		//추상메소드 선언시 시 선언되어 있는 내용이 없으므로 객체 생성을 할 수 없다
 		driver.drive(bus);
		driver.drive(taxi);
	}
}
