
public class Ex06 {
	public static void main(String[] args) {
		//정수의 기본크기는 4바이트
		short sh1 = 32767;
		short sh2 = 32767;
		int sh3 = sh1+sh2; //short ==> int 자동형변환이 됨
		//			정수+정수
//					4byte + 4byte = 4byte
		short sh4 = 10;
		short sh5 = 20;
		int sh6 = sh4+sh5;
		System.out.println(sh6);
		
		short sh7 =(short)(sh4+sh5);
		System.out.println(sh7);
				
		int i = (short)sh4 + (short)sh5;
	//4byte ==> 2byte => 4byte
		
		
		int i1 = 10;
		int i2 = 20;
		double d1 = i1/ i2;
		//          4byte/4byte = 10/3 = 3
		System.out.println(d1);
		d1 = (double)  i1 /i2;
		//			8byte/4byte -> 8byte/8byte
		System.out.println(d1);
		
		float f1 = 3.5f;
		float f2 = 3.7f;
		float f3 = f1+f2; //실수 인경우 4바이트 연산이 가능
		
		System.out.println(f3);
		double d4 = 3.8;
		double d5= f1+d4;
		System.out.println(d5);
		double d6 = 3.5 + 4;//?  = 3.5 + 4; // 8byte + 4byte = 8byte + 8byte
		System.out.println(d6);
		
		short sh = -127;
//		--1 = 1
//		-sh = --sh = 127
		int ss = -sh;
		System.out.println(ss);
	}	
}
