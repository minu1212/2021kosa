import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		
	
	// AZBYCXDWEVFUGTHSIRJQKPLOMNNMOLPKQJRISHTGUFVEWDXCYBZA
		char first = 64; 
		char second = 91;
		while (true){
			first ++;
			second --;
//			System.out.print((int)first);
//			System.out.print((int)second);
			System.out.print(first);
			System.out.print(second);
			if(first > 89 || second < 66) break;
		}System.out.println(" ");	
		System.out.println("======================================");
			/*
			   1  2  3  4 5 6 7 8 9
			**********************************
			1* 1 2 3 4 5 6 7 8 9
			2* 2 4 6 8 10 12 14 16 18
			3* 3 6 9 12 15 18 21 24 27
			4* 4 8 12 16 20 24 28 32 36 ???
			9* 9 18 27 36 45 54 63 72 81
			*/
			for(int f=1;f<=9;f++) {
				System.out.print(" "+f);
			}System.out.println(" ");
			System.out.println("**********************************");
			
			for(int f2=1;f2<=9;f2++) {
				System.out.print(f2+"* ");
				
				for(int r = 1; r <= 9; r++ ) {
					System.out.print(f2 * r+" ");
					
				}System.out.println(" ");
			}System.out.println("=======================================");
			
			

//	double num=0.0, sum=0.0;
//	1/2 + 2/3 +3/4 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10의 합을 구하는 프로그래밍하시오.
		double sum = 0.0;
		double i = 0.0;
		double j = 1.0;
		for(double M = 1; M<=9; M++) {
			i++;
			j++;
			if (i == 4 && j == 5)continue; 
//			System.out.println("i = "  + i);
//			System.out.println("j = " + j);
//			System.out.println("i / j = "+i/j);
			sum = sum + i/j;
//			System.out.println(sum); 
		}System.out.println("총합 : "+sum);
		System.out.println("================================");
//
//	몸무게를 입력하시오 : 45.5
//	몸무게를 입력하시오 : 27.3
//	몸무게를 입력하시오 : 12.6
//	몸무게를 입력하시오 : 65.4
//	최대값=65.40
//	최소값=12.60
//	합=150.80
//	평균=37.70
	Scanner sc = new Scanner(System.in);
	
	System.out.print("몸무게를 입력하시오 : ");
	double n1 = sc.nextDouble();
	System.out.print("몸무게를 입력하시오 : ");
	double n2 = sc.nextDouble();
	System.out.print("몸무게를 입력하시오 : ");
	double n3 = sc.nextDouble();
	System.out.print("몸무게를 입력하시오 : ");
	double n4 = sc.nextDouble();
	double max = 0;
	double min = 0;
	
	if (n1 > n2 && n1 > n3 && n1 > n4) {
		max = n1;
	}else if (n2 > n1 && n2 > n3 && n2 > n4) {
		max = n2;
	}else if (n3 > n1 && n3 > n2 && n3 > n4) {
		max = n3;
	}else if (n4 > n1 && n4 > n3 && n4 > n2) {
		max = n4;
	}
	
	if (n1 < n2 && n1 < n3 && n1 < n4) {
		min = n1;
	}else if (n2 < n1 && n2 < n3 && n2 < n4) {
		min = n2;
	}else if (n3 < n1 && n3 < n2 && n3 < n4) {
		min = n3;
	}else if (n4 < n1 && n4 < n3 && n4 < n2) {
		min = n4;
	}
	
	double sum1 = n1 + n2 + n3 + n4;
	double avr = sum1/4;
	System.out.println(String.format("최대값 : %.2f",max));
	System.out.println(String.format("최소값 : %.2f",min));
	System.out.println(String.format("합계 : %.2f",sum1));
	System.out.println(String.format("평균 : %.2f",avr));

	


//	2*1=2 3*1=3 ?????? 9*1=9
//	2*2=4 3*2=6 ?????? 9*2=18
//	2*3=6 3*3=9 ?????? 9*9=81
//	???
//	2*9=18 3*9=27 ?????? 9*9=81
	for(int gop =1; gop <= 9; gop++) {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "*" + gop + "=" + dan*gop +" ");
		}System.out.println(" ");
	}
	

//	9단부터 2단까지 열로 출력
	for(int dan =2; dan <= 9; dan++) {
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + "*" + gop + "=" + dan*gop );
		}System.out.println(" ");
	}

//	1. 상품코드는 1, 2, 3, 4, 5 중 하나이고 1이면 단가가 50000원, 2이면 30000원,
//	3이면 35000원, 4이면 40000원, 5이면 80000원이다.
	int salestarget = 0;
	switch(salestarget){
		case 1:salestarget = 50000;
		case 2:salestarget = 30000;
		case 3:salestarget = 35000;
		case 4:salestarget = 40000;
		case 5:salestarget = 80000;
	}
//	2. 상품코드 값과 수량을 입력받는다.
	Scanner sc1 = new Scanner(System.in);
	System.out.println("상품코드를 입력하시오 : 1,2,3,4,5");
	int salesprice = sc1.nextInt();
	System.out.println("상품수량을 입력하시오 : ");
	int salesget = sc1.nextInt();
//	3. 상품코드를 가지고 단가의 판정을 한다.
//	4. 금액은 수량*단가로 계산한다.
//	5. 금액을 출력한다.
	System.out.println("고르신 제품의 금액은 : "+salestarget*salesget+"원 입니다.");

//	6. 상품코드 값이 1부터 5가 아닐 때까지 다시 입력을 받는다.
	}
}
