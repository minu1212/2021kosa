package field_polymorphism;

public class Car {
//	Tire frontLeftTire = new Tire();//Tire�� interface�̹Ƿ� ��ü�����Ҽ�����.
	
	//�θ𺯼��� �ڽ� ��ü�� ������ �� �ִ�. �ڵ�����ȯ
	Tire frontLeftTire = new KumhoTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
//	
//	Tire tire[] = new Tire[4];
//	
//	int i1 = 0;
//	int i2 = 1;
//	int i3 = 2;
//	int i4 = 5;
//	
//	int i [] = new int[4];
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
