
public class Ex18 {
	public static void main(String[] args) {
		//whlie문 3단부터 7단까지 출력하시오
		int gop = 1;
		while (gop <= 9){
			System.out.println("3 * "+gop+" = "+ 3 * gop);
			gop++;
		}
		
		
		
		int dan = 3;
		while(dan <= 7) {
			for (gop =1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = "+dan*gop);
			}
			dan++;
		}
		
		
		System.out.println("=======================");
		
		dan = 3;
		while(dan <= 7) {
			gop = 1;
			while (gop <= 9) {
			System.out.println(dan + " * " + gop + " = "+dan*gop);
			gop++;
			}
			dan++;
		}
	}
}
