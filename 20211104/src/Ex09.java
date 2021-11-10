
public class Ex09 {
	public static void main(String[] args) {
		//파이썬 : not False  =True; not True = False
//		System.out.println(true);
		
		//not 연산자 !
		System.out.println(!true);
		System.out.println(!false);
		
		boolean b = true;
		System.out.println(!b);
		System.out.println(!!b);
		
		boolean b1 = false;
		System.out.println(!b1);//true
		System.out.println(!!b1);//false
		
		//단항연산 : !, ++, --, -
		
		//논리연산 true and true &&
		boolean b2 = true && true;
		System.out.println(b2);
		System.out.println(true && false);
		
		//true or true ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//논리연산자 : &&(and), ||(or)
		//비교(관계)연산자 : >,<,>=,<=,==,!=
		int i = 10;
		int j = 20;
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
		
		boolean b3;
		b3 = i > j;
		System.out.println("b3 : "+b3);
		//문제 : 윤년 구하기 4년에 한번 100년마다 x 400년 마다 한번
		int years = 2200;
		boolean result;
		result = years % 4 == 0 && years % 100 !=0 || years % 400 == 0;
		System.out.println(result);//평년
		
		float f = 10.1f;//10.100000001000000000
		double d = 10.1;//10.100000001111111111
		boolean b4;
		b4 = f == d;
		System.out.println(b4);
		b4 = (double)f == d;
		//10.100000001000000000
		//10.100000001111111111
		System.out.println(b4);
		b4 = (float)d == f;
		//10.100000001
		//10.100000001
		System.out.println(b4);
		
		i = 10;
		d = 10.0;
		b4 = i == d;//4byte == 8byte ==>8byte == 8byte
//										 10.0 == 10.0
		System.out.println(b4);
		
		int i3 = 65;
		int i4 = 75;
		int i5 = 85;
		boolean b5,b6,b7;
		b5 = i3 > i4;
		b6 = i4 < i5;
		b7 = b5 && b6;

		
		System.out.println(b5);//65 > 75 = false
		System.out.println(b6);//75 < 85 = true
		System.out.println(b7);//false && true = false
		b7 = i3 > i4 && i4 < i5;
		System.out.println(b7);
		
		b7 = b5 || b6;//flase || true = true
		System.out.println(b7);
		b7 = i3 > i4 || i4 < i5;
		System.out.println(b7);
		
		
	}
}
