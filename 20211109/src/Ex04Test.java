
public class Ex04Test {
	public static void main(String[] args) {
		Ex04 ex04;
		ex04 = new Ex04();
		ex04.setData(18, 175.5, false, "�̻��");
		String name = ex04.getName();
		System.out.println(name);
		Ex04 ex004;
		ex004 = new Ex04();
		ex004.setAge(35);
		ex004.setGender(false);
		ex004.setHeight(175.5);
		ex004.setName("�̼���");
		name = ex004.getName();
		System.out.println(name);
		
		//��ü���⿡���� �Ʒ��� ���� ����ϸ� �ȵȴ�.
		Ex04 ex041 = new Ex04();
		ex041.age = 20;
		ex041.gender = true;
		ex041.height = 160.5;
		ex041.name = "������";
		System.out.println(ex041.name);
		
		
	}
}
