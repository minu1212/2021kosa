
public class Ex02Test {
	public static void main(String[] args) {
		int i = 10;
//		cal = calulator(); 
//		cal.first = 10
		
//		�ڷ��� ������ = new Ŭ������();
		Ex02 ex02 = new Ex02(); 
		ex02.addr = "����";
		ex02.age = 20;
		ex02.name = "���ο�";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.age);
		System.out.println(ex02.name);
		System.out.println(ex02.gender);

		//�ٸ� ��ü ����� ����
		Ex02 ex021 = new Ex02();
		ex021.addr = "����";
		ex021.age = 20;
		ex021.gender = false;
		ex021.name = "��Կ�";
		System.out.println(ex021.addr);
		System.out.println(ex021.age);
		System.out.println(ex021.name);
		System.out.println(ex021.gender);

		
	}
}
