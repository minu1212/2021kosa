
public class Ex21 {
	public static void main(String[] args) {
		//1~45중 3개숫자
		int num1, num2, num3;
		num1 = (int)(Math.random() * 45 ) + 1; //1~45
		do {
			num2 = (int)(Math.random() * 45) + 1; //1~45		
		}while(num1 == num2);
		do {
			num3 = (int)(Math.random() * 45) + 1; //1~45
		}while(num1 == num3 || num2 == num3);
		
		System.out.println(num1);
		System.out.println(num2);	
		System.out.println(num3);
		
		
	}
}
