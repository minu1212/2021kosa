
public class RheeAirPlaneTest {
	public static void main(String[] args) {
		RheeAirPlane ex = new RheeAirPlane();//RheeAirPlane은Airplane을 상속받는다.
		ex.fly();//부모클래스의 fly 실행
		ex.flyMode = RheeAirPlane.SUPERSONIC;
		ex.fly();//자식클래스이 fly 실행
	}
}
