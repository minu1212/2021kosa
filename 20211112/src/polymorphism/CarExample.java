package polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();//return 1,2,3,4
			switch(problemLocation){
			case 1:
				System.out.println("앞왼쪽 | 타이어 교체");
				car.frontLeftTire =new HankookTire("앞왼쪽", 6);
				break;
			case 2:
				System.out.println("앞오른쪽 | 타이어");
				car.frontRightTire =new HankookTire("앞오른쪽", 6);
				break;
			case 3:break;
			case 4:break;
				
			}
			
		}
	}
}
