package abstract_class;

//추상클래스 : 추상메소드를 가지고있는 클래스
public abstract class Phone {//부모 클래스는 abstract사용가능
	public String owner;
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//정의되어 있지 않은 메소드
	public abstract void turnOn(); //추상메소드
	public abstract void turnOff();
}
