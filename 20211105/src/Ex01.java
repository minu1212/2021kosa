
public class Ex01 {//review
	public static void main(String[] args) {
		/*���ͳ� : �ڿ���(�ѱ���....) �ڿ���:����,�Ǽ�
		 * �ڷ���  : ���� byte(1), char(2) short(2) int(4) long(8)
		 * �Ǽ�  : float(4), double(8)
		 * ���� : char(2) : 'a', '��'
		 * ���ڿ� : String : "abcd", " ����" "a"
		 */
		//����ȯ : �ڵ�����ȯ, ��������ȯ
		short sh = 10;
		int i = sh; // �ڵ�����ȯ
		sh = (short)i;//��������ȯ (int(4byte), short(2))ū ���� ���� ����  ���� ��� ���� ����ȯ
		short sh1 = 10;
		short sh2 = 20;
//		short sh3 = sh1 + sh2; ( X )
		int i1 = sh1 + sh2;
		short sh4 = (short)(sh1+sh2);
//		short sh5 = (short)sh1+(short)sh2; ( X )
		//			4byte => 2byte => 4byte
		//				��������ȯ      �ڵ�����ȯ
		//	byte(1) => char(2) => short(2) => int(4) => long(8) => float(4) => double(8)
		//	�� �������δ� �������� �ڵ�����ȯ�� �Ͼ��.
		
		//��� : , �ݺ���
//		���ǹ�
		//if , if~else, if~else if...~else
		//switch ~ case
		int money = 3000;
		if (money >= 5) {
			System.out.println("���� Ÿ�� ���ÿ�");
		}
		if(money >= 3000) {
			System.out.println("���� Ÿ�� ���ÿ�");
		}else {
			System.out.println("�ɾ�ÿ�");
		}
		
		
	}
}
