
public class Ex01Test {
	
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		double d = 10.5;
		System.out.println(d);
								//		i0 i1 i2
		int ii [] = new int[3]; //ii : |  |  |  | ��ü
							  	//      0   1  2
		ii[0] = 10; //int i0 = 10;
		ii[1] = 20;
		System.out.println(ii[0]);
		System.out.println(ii[1]);
		
		Ex01 ex01 = new Ex01();	// ex01 | radius | pi  ��ü
								// index���� �ƴ� ��������� ȣ��
								// python�� dicsnary�� ����
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
		//�������� Ŭ���� - �ȿ��� ����Ŭ������ ���� �������� ����Ǿ�����.
//		Ŭ���� ������ �迭�� ����� �������� Ŭ������ �ּҰ��� �����ϴ� �迭 
//		= ex001 �̹迭�ȿ��� python�� ��ųʸ��� ���� �ε����� ȣ���ϴ� ���� �ƴ� ���������� ȣ��.

		ex011.radius = 20;
		
		//������ ii�迭�� ����
		double  d001 [] = new double[3];//double |  |  |  |
		int 	i001 [] = new 	 int[3];//int    |  |  |  |
		Ex01   ex001 [] = new 	Ex01[3];//Ex01   |  |  |  |
//												  0   1  2
		i001  [0] = 10;
		d001  [0] = 10.5;
		ex001 [0] = new Ex01();
		//ex001[0]�� ���ο� ��ü��(�ؾnew Ex01) ����ڴ�.
		
		
		ex01 = new Ex01();
		ex01.pi = 3.141592;
		ex001 [0].pi = 3.141592;
	}
	
}
