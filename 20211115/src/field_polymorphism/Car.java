package field_polymorphism;

public class Car {
//	Tire frontLeftTire = new Tire();//Tire은 interface이므로 객체생성할수없다.
	
	//부모변수에 자식 객체를 대입할 수 있다. 자동형변환
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
