package polymorphism;

public class Tire {// p314
	public int maxRotation;// 초기값 0
	public int accumelatedRotation;// 누적 회전수(=초기값 필요 x)
	public String location;

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {// 타이어가 굴러가는 메소드 오버라이드
		++accumelatedRotation;
		if (accumelatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumelatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}

	}

}
