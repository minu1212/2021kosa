package casting;

public class VehicleExample {
	public static void main(String[] args) {
		//자동형변환(=업캐스팅)
		//부모에 있는 것만 사용가능
		Vehicle vehicle = new Bus(); 
		vehicle.run();
		
		//강제 형변환(=다운캐스팅)
		//자식객체에 있는 것도 사용가능
		Bus bus = (Bus)vehicle; //(업캐스팅하게 되면 자식객체의 메소드는 사용할 수 없게 되므로 다운캐스팅이 필요하다.
		bus.checkFare();
		bus.run();
	}
}
