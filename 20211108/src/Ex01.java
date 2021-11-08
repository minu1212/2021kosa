
public class Ex01 {
	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		int y = 0;
		for(int i = 1; i<=10; i++) {
			System.out.println(y);
			y++;
		}
		
		for(int i = 1; i <= 10; i++) {
			int y1 = 0; //반복문 안에 변수 선언이 가능
			y1++;
			System.out.println(y1);
		}
		System.out.println("=================================");
		for(int i = 11; i<= 20; i++) {
			System.out.println("wjdtjrals qhrhtlvek wkfwlsofRk");
		}
		System.out.println("=================================");

		for(int i = 10; i<=19; i+=2) {
			System.out.println(i);
		}
		System.out.println("=================================");

		for(int i = 10; i <= 19; i++) {
			if(i % 2 != 0) continue;
			System.out.println(i);
		}
		System.out.println("=================================");
		int y2 = 1;
		for(int i = 10; i <= 109; i+=4) {
			System.out.println(y2);
			y2++;
		}
		System.out.println("=================================");
		for(int i = 12; i <= 31; i+=5) {
			System.out.println("개발자는 들여쓰기를 잘해야합니다.");
		}
		System.out.println("=================================");

		int y3 = 1;
		for(int i = 1; i <=9; i++) {
			System.out.println("7 * "+y3+" = "+7*y3);
			y3++;
		}
		System.out.println("=================================");

		int num = (int)(Math.random()*45)+1;
		for(int i = 1; i<= num; i++) {
			System.out.println(i);
		}
		System.out.println("=================================");

		for(int i=1; i<=100; i++) {
			if (i % 2 != 0)continue;
			System.out.println(i);
			if(i == 10)break;
		}
		System.out.println("=================================");


		
		for(int i = 1; i<=10; i++) {
			int ran = (int)(Math.random()*45)+1;
			if(ran %2 == 0) {
				System.out.println(ran*3);
			}else i--;
		}
		System.out.println("=================================");
		int x = 10; 
		int y5 = 19;
		int z = 2;
		for(int i = x; i <= y5; i += z) {
			System.out.println(i);
		}
		System.out.println("=================================");
		System.out.println("<table>");
		for(int i=1; i<=4; i++) {
			System.out.println("<tr><td> 1 </td><td>2");
			
		}
		System.out.println("</table>");
	}
}
