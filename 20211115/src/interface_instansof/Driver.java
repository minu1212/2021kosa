package interface_instansof;

public class Driver {
	public void drive(Vehicle vehicle) {
		//instanceof�� Ŭ������ ��ü�� ������ ���� �� ���
		if (vehicle instanceof Bus) {// instanceof��ü�� ���Ҷ� ���
			// vehicle ��ü�� BusŬ������ ������� ��ü�Դϱ�?
			// instanceof�� ������� boolean�̴�.
			Bus bus = (Bus) vehicle;
			bus.checkFare();

		}
		vehicle.run();
	}
}
