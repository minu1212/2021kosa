package casting;

public class VehicleExample {
	public static void main(String[] args) {
		//�ڵ�����ȯ(=��ĳ����)
		//�θ� �ִ� �͸� ��밡��
		Vehicle vehicle = new Bus(); 
		vehicle.run();
		
		//���� ����ȯ(=�ٿ�ĳ����)
		//�ڽİ�ü�� �ִ� �͵� ��밡��
		Bus bus = (Bus)vehicle; //(��ĳ�����ϰ� �Ǹ� �ڽİ�ü�� �޼ҵ�� ����� �� ���� �ǹǷ� �ٿ�ĳ������ �ʿ��ϴ�.
		bus.checkFare();
		bus.run();
	}
}
