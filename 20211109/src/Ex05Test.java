
public class Ex05Test {
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		// privata = ���� ����� ������ ���� ����.
		
		/*
		ex05.age  = 20;//����� ����
		ex05.height = 170;
		*/
		
		ex05.setAge(30);
		ex05.setHeight(160.7);
		//���� �����ö��� �������� �Ұ�
//		System.out.println(ex05.age);
		
		ex05.name = "�����";
		System.out.println(ex05.getAge());
		System.out.println(ex05.name);
	}
}
