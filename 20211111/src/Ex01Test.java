
public class Ex01Test {//�̱��� - �ϳ��� ���ø����̼ǳ����� �� �ϳ��� �����Ǵ� ��ü,
//	������ �տ� private�� ����Ͽ� �ܺο����� ������ ���´�.new������ ��� X,Ŭ���� �ڽ��� Ÿ������ ���� �ʵ� ����

	public static void main(String[] args) {//p244
		/*
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
		Ex01 ex03 = new Ex01();
		*/
		/*
		 * Ŭ���� ����1 = Ŭ����/getInstance()
		 */
	Singleton s1 = Singleton.getInstance(); //30000
	Singleton s2 = Singleton.getInstance(); //30000
	if(s1 == s2) {
		System.out.println("s1��  s2�� ����");
	}else {
		System.out.println("s1�� s2�� �ٸ���");
	}
	
	}
}
