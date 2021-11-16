package WrapperExample;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = 100; // 박싱 boxing

		int i1 = i;// Interger → int : 언박싱 unboxing
		int i2 = 20;
		// 정수연산시에 자동 unboxing
		int result = i + i2;

		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		Integer i5 = Integer.valueOf("300");
		Integer i6 = 10;
		
		int i7 = i6; //자동 unboxing
		i7 = i6.intValue();//unboxing
		
	}
}
