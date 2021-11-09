
public class Ex05 {//private(접근 지정자) - 외부접근 불가.
	//캡슐화
	private int age;
//접근지정자
	private double height;
	String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return this.age;
	}
	
	public double getHeight() {
		return this.height;
	}
	
}
