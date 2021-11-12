package polymorphism;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(maxRotation,location);
	}
	
	@Override
	public boolean roll() {//Ÿ�̾ �������� �޼ҵ� �������̵�
		++accumelatedRotation;
		if(accumelatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� : "+(maxRotation - accumelatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location + "Hankook Tire ��ũ ***");
			return false;
		}
		
	}
	
}
