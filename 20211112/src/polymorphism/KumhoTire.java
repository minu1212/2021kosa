package polymorphism;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(maxRotation,location);
	}
	
	@Override
	public boolean roll() {//Ÿ�̾ �������� �޼ҵ� �������̵�
		++accumelatedRotation;
		if(accumelatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ���� : "+(maxRotation - accumelatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location + "KumhoTire ��ũ ***");
			return false;
		}
		
	}
}
