
public class Ex13 {
	public static void main(String[] args) {
		//90�̻��̸� 'A' 80�̻��̸� 'B' 70�̻��̸�'C',60 �̻��̸�'D'�ƴϸ� 'F'
		int score = 75;
		if (score >= 90) {
			System.out.println('A');
		}else if(score >= 80) {
			System.out.println('B');
		}else if(score >= 70) {
			System.out.println('C');
		}else if(score >= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}		
		System.out.println("===============================");
		//95�̸� A+, 90�̸� A
		int score2 = 75;
		if (score2 >= 90) {
			if(score2 >= 95)System.out.println("A+");
			else System.out.println('A');
		}else if(score2 >= 80) {
			if(score2 >= 85)System.out.println("B+");
			else System.out.println('B');
		}else if(score2 >= 70) {
			if(score2 >= 75) System.out.println("C+");
			else System.out.println("C");
		}else if(score2 >= 60) {
			if(score2 >=65)System.out.println("D+");
			else System.out.println('D');
		}else {
			System.out.println('F');
		}
		
	}
}
