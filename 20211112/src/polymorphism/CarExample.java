package polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();//return 1,2,3,4
			switch(problemLocation){
			case 1:
				System.out.println("�տ��� | Ÿ�̾� ��ü");
				car.frontLeftTire =new HankookTire("�տ���", 6);
				break;
			case 2:
				System.out.println("�տ����� | Ÿ�̾�");
				car.frontRightTire =new HankookTire("�տ�����", 6);
				break;
			case 3:break;
			case 4:break;
				
			}
			
		}
	}
}
