package polymorphism;

public class Car {
	Tire frontLeftTire = new Tire(6, "�տ���");
	Tire frontRightTire = new Tire(2, "�տ�����");
	Tire backLeftTire = new Tire(3, "�ڿ���");
	Tire backtRightTire = new Tire(4, "�ڿ�����");

	int run() {//default ���� ������
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backtRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
