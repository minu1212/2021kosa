import javax.security.sasl.SaslException;

public class Ex02 {//�Ű����� ������ ��� ����

	public static void main(String[] args) {
		//���� ����Ʈ
		int i [] = new int [3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		//
		int i1 = 10;
		int i2 = 10;
		int i3 = 10;
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		
		
		
		//Account ����Ʈ
		Account [] accs = new Account[3];
		//�Ű������� �ִ� ������ ���
		accs[0] = new Account("1111","�̼���",100); //����ʱ�ȭ0
		accs[1] = new Account("2222","�̼���",100); //����ʱ�ȭ1
		
		//string ����Ʈ
		String [] str = new String[3];
		str[0] = "�̼���";
		str[0] = "�����";
		
	}
}
