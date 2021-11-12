package polymorphism;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(maxRotation,location);
	}
	
	@Override
	public boolean roll() {//타이어가 굴러가는 메소드 오버라이드
		++accumelatedRotation;
		if(accumelatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : "+(maxRotation - accumelatedRotation)+"회");
			return true;
		}else {
			System.out.println("*** "+location + "KumhoTire 펑크 ***");
			return false;
		}
		
	}
}
