
public class Ex01Test {
	
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		double d = 10.5;
		System.out.println(d);
								//		i0 i1 i2
		int ii [] = new int[3]; //ii : |  |  |  | 객체
							  	//      0   1  2
		ii[0] = 10; //int i0 = 10;
		ii[1] = 20;
		System.out.println(ii[0]);
		System.out.println(ii[1]);
		
		Ex01 ex01 = new Ex01();	// ex01 | radius | pi  객체
								// index값이 아닌 선언면으로 호출
								// python의 dicsnary와 같다
								// {"radius" : 10 , "pi" :3.141592 }
				
//		i[0]
		ex01.radius = 10;
		ex01.pi = 3.141592;
		
		double result = ex01.areaCircle();
		System.out.println(result);
		System.out.println(ex01.radius);
		System.out.println(ex01.getRadius());
		System.out.println(ex01.getPi());
		
		Ex01 ex011 = new Ex01(); //ex011| radius | pi |
		//도장찍은 클래스 - 안에는 기존클래스와 같이 변수들이 선언되어있음.
//		클래스 명으로 배열을 만들어 도장찍은 클래스의 주소값을 저장하는 배열 
//		= ex001 이배열안에는 python의 딕셔너리와 같이 인덱스로 호출하는 것이 아닌 변수명으로 호출.

		ex011.radius = 20;
		
		//맨위의 ii배열과 같이
		double  d001 [] = new double[3];//double |  |  |  |
		int 	i001 [] = new 	 int[3];//int    |  |  |  |
		Ex01   ex001 [] = new 	Ex01[3];//Ex01   |  |  |  |
//												  0   1  2
		i001  [0] = 10;
		d001  [0] = 10.5;
		ex001 [0] = new Ex01();
		//ex001[0]에 새로운 객체를(붕어빵new Ex01) 만들겠다.
		
		
		ex01 = new Ex01();
		ex01.pi = 3.141592;
		ex001 [0].pi = 3.141592;
	}
	
}
