
public class Ex10 {
	public static void main(String[] args) {
		int i1 [] = {1 ,2 ,3 ,4 };
		int i2 [] = {10,20,30,40};
		int i3 [] = {11,22,33,44};
		
		int i[][] = new int [3][];
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		
		//i1
		System.out.println(i[0][0]);
		System.out.println(i[0][1]);
		System.out.println(i[0][2]);
		System.out.println(i[0][3]);
		
		System.out.println("==================");
		
		//i2
		System.out.println(i[1][0]);
		System.out.println(i[1][1]);
		System.out.println(i[1][2]);
		System.out.println(i[1][3]);
		
		System.out.println("==================");
		
		//i3
		System.out.println(i[2][0]);
		System.out.println(i[2][1]);
		System.out.println(i[2][2]);
		System.out.println(i[2][3]);
		
		System.out.println("==================");
		
		int ii [][] = new int [3][4];
		ii[0][0] = 1 ; 
		ii[0][1] = 2 ; 
		ii[0][2] = 3 ; 
		ii[0][3] = 4 ;
		
		ii[1][0] = 10; 
		ii[1][1] = 20; 
		ii[1][2] = 30; 
		ii[1][3] = 40;
		
		ii[2][0] = 11; 
		ii[2][1] = 22; 
		ii[2][2] = 33; 
		ii[2][3] = 44;
		
		//2���� �迭 ii�� �ִ� ���� ����Ͻÿ�.
		for(int j = 0; j <= 2; j++) {
			for(int k = 0;k <= 3; k++) {
				System.out.println(ii[j][k]);
			}
		}
	}
}
