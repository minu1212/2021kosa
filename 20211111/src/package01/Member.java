package package01;

public class Member {
	int age;
	int height;
	String name;
	boolean gender;
	public Member(int age, int height, String name) {
		super();
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	
	
	
	
}
