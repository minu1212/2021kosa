
public class Ex13 {//���� for ��
	public static void main(String[] args) {
//		5�� ���
		for(int gob = 1; gob <= 9; gob++) {
			System.out.println("5 * "+gob+" = " + 5 * gob);
		}
		System.out.println("========================");
		//6�� ���
		for(int gob = 1; gob <= 9; gob++) {
			System.out.println("6 * "+gob+" = " + 6 * gob);
		}
		System.out.println("========================");
		//7�� ���
		for(int gob = 1; gob <= 9; gob++) {
			System.out.println("7 * "+gob+" = " + 7 * gob);
		}
		System.out.println("============for============");
		for(int dan = 1; dan <= 9; dan++) {
			for(int gob = 1; gob <= 9; gob++) {
				System.out.println(dan + " * "+gob+" = " + dan * gob);
			}
		}
	}
}
