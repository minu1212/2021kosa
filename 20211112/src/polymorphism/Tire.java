package polymorphism;

public class Tire {// p314
	public int maxRotation;// �ʱⰪ 0
	public int accumelatedRotation;// ���� ȸ����(=�ʱⰪ �ʿ� x)
	public String location;

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {// Ÿ�̾ �������� �޼ҵ� �������̵�
		++accumelatedRotation;
		if (accumelatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumelatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}

	}

}
