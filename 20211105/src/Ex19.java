
public class Ex19 {
	public static void main(String[] args) {
		//for �� 3�ܺ��� 7�ܰ��� 4������ 6������
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
