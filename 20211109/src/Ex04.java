
public class Ex04 {
	int age;
	double height; //��� �ʵ�, ��� ����
	boolean gender;
	String name;
	
	public void setData(int age, double height, boolean gender, String name) {
		this.age = age;
		this.height = height;//����ʵ�, �������
		this.gender = gender;
		this.name = name;
	}
	
	//setter - ���� �ֱ�
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
	
	//getter - ���� �޾ƿ���
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
