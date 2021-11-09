
public class Member {
	int age;
	double height;
	String name;

	public Member() {//defalt생성자
	}

	public Member(int age) {//메서드 오버로딩
		this.age = age;
	}

	public Member(double height) {
		this.height = height;
	}

	public Member(String name) {
		this.name = name;
	}

	public  Member(double height, int age , String name) {
		this.height = height;
		this.age = age;
		this.name = name;
	}
	public Member(int age, double height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}

	//get,set뒤의 멤버필드의 첫글자는 대문자.
	

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
