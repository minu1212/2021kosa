
public class Ex20 {//do while
	public static void main(String[] args) {
		int i = 1;
		
		while ( i <= 9) {
			System.out.println("3 * "+i+" = "+3*i);
			i++;
		}
		System.out.println("==================");
		i = 10;
		do{//������ �ѹ��� ������ �ؾ��ϴ� ���
			System.out.println("������ 3��");
			System.out.println("3 * " + i + " = " + 3 * i);
			i++;
		}while(i <= 9);
	}	
}
