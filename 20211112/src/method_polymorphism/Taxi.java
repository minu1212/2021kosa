package method_polymorphism;

public class Taxi extends Vehicle{

	@Override //������ : Vehicle���� ���Ǵ� run()�޼ҵ��� ������ ������� �ʰ� ������ �ϰڴ�.
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}
