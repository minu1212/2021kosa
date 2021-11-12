package polymorphism;

public class Car {
	Tire frontLeftTire = new Tire(6, "앞왼쪽");
	Tire frontRightTire = new Tire(2, "앞오른쪽");
	Tire backLeftTire = new Tire(3, "뒤왼쪽");
	Tire backtRightTire = new Tire(4, "뒤오른쪽");

	int run() {//default 접근 지정자
		System.out.println("[자동차가 달립니다.]");
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
		System.out.println("[자동차가 멈춥니다.]");
	}
}
