
public class Ex09 {//for 7단 홀수만 출력하기
	public static void main(String[] args) {
		System.out.println("7 * " + 1 + " = " + 7 * 1);
		System.out.println("7 * " + 3 + " = " + 7 * 3);
		System.out.println("7 * " + 5 + " = " + 7 * 5);
		System.out.println("7 * " + 7 + " = " + 7 * 7);
		System.out.println("7 * " + 9 + " = " + 7 * 9);

		System.out.println("======================");
		
		for(int i = 1; i <=9 ; i+= 2) {
			System.out.println("7 * " + i + " = " + 7 * i);
		}
		
		System.out.println("==================for↓====================");

		for(int i = 1; i <=9 ; i++) {
			if (i % 2 != 0 ) {
				System.out.println("7 * " + i + " = " + 7 * i);
			}
		}
	}
}
