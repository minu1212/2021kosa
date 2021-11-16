package WrapperExample;

public class integerWrapperEx {
	public static void main(String[] args) {
		int i = 10;
		String s = "10";

		Integer i1 = 10;// wrapper //int
		i1=Integer.parseInt(s);
		
		byte by = 10;
		Byte by1 = 01;
		
		short sh = 10;
		Short sh1 = 10;
		
		double d = 10.5;
		Double d1 = 10.5;
		
		float f = 10.5f;
		Float f1 = 10.5f;
//		f = null; null : 값은 존재하되 어떠한 값인지를 모르는 것
		
		f1 = null;//Wrapper자료형은 문자열을 숫자로 변환하기 쉽고, null값을 저장할 수 있다.	
	}
	

}
