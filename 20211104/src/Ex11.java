
public class Ex11 {
	public static void main(String[] args) {
		/* Python
		 * if 조건식 :
		 * 		명령문 1
		 * 		...
		 * 
		 * Java
		 * if(조건식){
		 * 		명령문 1
		 * 		...
		 * }
		 * 
		 * 자바에서는 들여쓰기를 사용하지 않아도 되지만 가독성을 높이기 위해서 사용한다.
		 * 명령문이 하나일 경우 중괄호 생략가능
		 */
		
		int i = 10;
		if ( i < 20) 
			System.out.println("작다.");
		
		if ( i == 10) {
			System.out.print("i는 ");
			System.out.println("10보다 작다");
			System.out.println("...");
		}
		
		int money = 3000;
		//돈이 3000원을 초과하면 차를 타고 가시오.
		if (money > 3000) 
			System.out.println("차를 타고 가시오");
			System.out.println("if문이 종료되었습니다.");
		
		if (money > 3000) {
			System.out.println("차를 타고 가시오");
		}
			System.out.println("if문이 종료되었습니다.");

		if (money > 3000) {
			System.out.println("차를 타고 가시오");
			System.out.println("if문이 종료되었습니다.");
		}
				
		

	}
}