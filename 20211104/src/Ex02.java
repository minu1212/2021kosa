
public class Ex02 {
	public static void main(String[] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
//		b = -129;
//		b = 128;
		char ch = 0;//unicode : ���ڿ� �ش�Ǵ� ����
		System.out.println(ch);
		ch = 65535;
		System.out.println(ch);
		ch = 65;
		System.out.println(ch);
		ch = 97; // �ҹ��� = �빮�� + 32
		System.out.println(ch);
		ch = 'A'+32;
		System.out.println(ch);
		//char�� ���ڸ� ��Ÿ���ִ� �ڷ���
		ch = '��';
//		System.out.println(ch);
		System.out.println((int)ch);
		short sh = -32758;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
//			sh = -32769;
//		sh = 323768;
		int i= -2147483648;
		System.out.println(i);
		i = 21478647;
		System.out.println(i);
		
		float f;
		f= 3.4f;
		System.out.println(f);
		double d = 3.4;
		System.out.println(d);
		
		long l = 10;
		System.out.println(l);
		l = 20000000l; 
		System.out.println(l);
		//������ �⺻ũ��� 4byte
		//�Ǽ��� �⺻ũ��� 8byte
	}
}
