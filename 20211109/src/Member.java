
public class Member {
	int age;
	double height;
	String name;

	public Member() {//defalt������
	}

	public Member(int age) {//�޼��� �����ε�
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

	//get,set���� ����ʵ��� ù���ڴ� �빮��.
	

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
