
public class Ex20 {//do while
	public static void main(String[] args) {
		int i = 1;
		
		while ( i <= 9) {
			System.out.println("3 * "+i+" = "+3*i);
			i++;
		}
		System.out.println("==================");
		i = 10;
		do{//무조건 한번은 실행을 해야하는 경우
			System.out.println("구구단 3단");
			System.out.println("3 * " + i + " = " + 3 * i);
			i++;
		}while(i <= 9);
	}	
}
