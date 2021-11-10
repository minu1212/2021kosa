
public class Ex04 {
//	실수형 리터널 : 
//	솟수점을 가지고 있는 수를 실수라고 한다.
public static void main(String[] args) {
	float f;//4byte : 정밀도 낮다
	double d;//8byte : 정밀도 높다
	//실스의 기본크기는 8바이트
	d = 0.1234567891232456789;
	f = 0.1234567891232456789f;
	System.out.println(d);
	System.out.println(f);
	boolean b = true;
	boolean b1 = false;
	String str = "true";//문자열
//	b = True;  python
	System.out.println(b);
	System.out.println(b1);
	System.out.println(str);
}

}
