
public class Ex02Test {
	public static void main(String[] args) {
		//final ������ �����ڸ� ���ؼ� �ʱ�ȭ�� ����
		Ex02 ex02 = new Ex02(10,20);//final������ ���� ��� ������ ���� �־���Ѵ�.
		//�ʱ�ȭ�� ���� �������� ���Ѵ�. = ��� ���⼭�� final����
//		ex02.first = 20;
		
		//��ü���� final ������ ���� ������ ���� �� �ִ�.
		Ex02 ex021 = new Ex02(30,40);
		System.out.println(ex02.first);
		System.out.println(ex021.first);
	}
}
