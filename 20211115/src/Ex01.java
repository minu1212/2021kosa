
public abstract class Ex01 {
	//멤버필드
	int first; 
	//생성자
	public  Ex01(int first) {
		this.first = first;
	}
	//추상메서드 : 정의되어 있지 않은 메소드
	public abstract void method01() ;
	//일반메소드
	public void method02() {
		System.out.println("Ex01 -method");
	}
}
