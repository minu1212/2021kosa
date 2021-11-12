
public class Ex03 extends Ex02{//자식클래스 상속, 메소드오버라이딩/로딩
	String subject;
	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}
	
	@Override
	public double area() {//메소드 오버라이드  - 부모클래스의 상속받은 메소드를 자식클래스에서 재정의
		return radius * radius * Math.PI;
	}
	
	public double area(double p) {//메소드 오버로딩
		return radius * radius * p;
	}
	
	public double area1() {//부모클래스의 area()사용
		return super.area();
	}
}
