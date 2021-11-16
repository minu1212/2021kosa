package WrapperExample;

public class ValueCompareEx {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		if (i1 == i2)
			System.out.println("같다");

		Integer i3 = 10;
		Integer i4 = 10;

		if (i1 == i3)
			System.out.println("같다");
		else
			System.out.println("다르다");
		if (i3.intValue() == i4.intValue()) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		i3 = 10;
		i4 = 10;
		// -124~127  = true
		System.out.println(i1 == i3);
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
	
		i3 = 300;
		i4 = 300;
		//-127보다 작고 127보다는 큰 값인 경우
		System.out.println(i1 == i3);;//false
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
	
	}
}
