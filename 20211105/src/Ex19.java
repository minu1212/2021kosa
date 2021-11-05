
public class Ex19 {
	public static void main(String[] args) {
		//for 문 3단부터 7단가지 4곱부터 6곱가지
		for (int dan = 3; dan <= 7 ; dan ++) {
			for(int gop = 4; gop <= 6; gop++) {
				System.out.println(dan +" * "+gop+" = "+dan *gop);
				gop++;
			}
			dan ++;
		}
		System.out.println("======================");
		int dan = 3;
		while(dan<=7) {
			int gop = 4;
			while(gop <= 6) {
				System.out.println(dan +" * "+gop+" = "+dan *gop);
				gop++;
			}
			dan++;
		}
	}
}
