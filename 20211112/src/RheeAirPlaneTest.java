
public class RheeAirPlaneTest {
	public static void main(String[] args) {
		RheeAirPlane ex = new RheeAirPlane();//RheeAirPlane��Airplane�� ��ӹ޴´�.
		ex.fly();//�θ�Ŭ������ fly ����
		ex.flyMode = RheeAirPlane.SUPERSONIC;
		ex.fly();//�ڽ�Ŭ������ fly ����
	}
}
