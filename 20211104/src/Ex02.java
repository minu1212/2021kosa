
public class Ex02 {
	public static void main(String[] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
//		b = -129;
//		b = 128;
		char ch = 0;//unicode : 문자에 해당되는 정수
		System.out.println(ch);
		ch = 65535;
		System.out.println(ch);
		ch = 65;
		System.out.println(ch);
		ch = 97; // 소문자 = 대문자 + 32
		System.out.println(ch);
		ch = 'A'+32;
		System.out.println(ch);
		//char는 문자를 나타내주는 자료형
		ch = '가';
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
		//정수의 기본크기는 4byte
		//실수의 기본크기는 8byte
	}
}
