
public class Test {
	public static void main(String[] args) {
		Board bd = new Board(1, "����", "������ƺ�", "����", "192.168.0.100", 2);
		System.out.println("���� : " + bd.getSubject());
		System.out.println("�۾��� : " + bd.getWriter());
		System.out.println("���� : " + bd.getContent());
		System.out.println("ip : " + bd.getIp());
		System.out.println("�湮�� �� : " + bd.getReaderCount());
		
		Car car = new Car("����", "�ҳ�Ÿ", "����", 240);
		Car car1 = new Car();
		car1.setColor("���");
		car1.setBrand("���");
		car1.setModel("K7");
		car1.setMaxSpeed(250);
		System.out.println(car1.getBrand());
		System.out.println(car1.getColor());
		System.out.println(car1.getMaxSpeed());
		System.out.println(car1.getModel());
	
	}
}
