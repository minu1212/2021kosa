
public class Ex04 {
	int age;
	double height; //멤버 필드, 멤버 변수
	boolean gender;
	String name;
	
	public void setData(int age, double height, boolean gender, String name) {
		this.age = age;
		this.height = height;//멤버필드, 멤버변수
		this.gender = gender;
		this.name = name;
	}
	
	//setter - 값을 주기
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	//getter - 값을 받아오기
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
	public boolean getGender() {
		return this.gender;
	}
}
