
public class Ex061 {
	String name;
	int age;
	double height;

	// �ڹٿ����� Ŭ�����̸��� �����ڸ��� ���ƾ� �Ѵ�. �Ϲ� �Լ��� ���� ��������(��ȯ��)�� ����� �Ѵ�,(ex void, int,... )
	//python������ �����ڴ� �ϳ� java������ �����ڰ� �������̴�.
		
//  ������
//	���������� Ŭ������(�Ű�����1,....)
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("������ ����");
	}
//	 	�޼���(Method) : class�ȿ� �ִ� �Լ� 
//	 	����������+��ȯ��+�Լ��� + (�Ű�����){
		
//		}

	
	// setter
	// void : ��ȯ�� - ��ȯ�� ���� ����.
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
	//int : ��ȯ�� - ������ ���� ��ȯ
	public int getAge() {
		return this.age; 
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;			
	}
}
