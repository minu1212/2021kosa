import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요. : ");
		String name = sc.next();
		System.out.println("안녕하세요 "+name+"님");
		System.out.print("당신의 나이는? : ");
		int num1 = sc.nextInt();
		System.out.println("당신의 나이는 "+num1+"이군요");
		*/
		//문제 : 단과 곱의 범위를 입력받아 구구단을 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 단을 입력하시오 : ");
		int Sdan = sc.nextInt();
		System.out.print("끝 단을 입력하시오 : ");
		int Edan = sc.nextInt();
		System.out.print("시작 곱을 입력하시오 : ");
		int Sgop = sc.nextInt();
		System.out.print("끝 곱을 입력하시오 : ");
		int Egop = sc.nextInt();
				
		int dan;	
		for(dan = Sdan;dan <= Edan; dan++) {
			int gop;
			for(gop = Sgop; gop <= Egop; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
}
