
public class Ex02 {
	public static void main(String[] args) {
//		  ���� ���� 10�� ����
//		�л��� ���� 10�̶� 10���� ������ ��������.
		
		int score1 = 20;
		int score2 = 30;
		int score3 = 20;
		int score4 = 30;
		int score5 = 20;
		int score6 = 30;
		int score7 = 20;
		int score8 = 30;
		int score9 = 20;
		int score10 = 30;
//		���� �ϳ��� 10���� ���� �����ϵ��� ������. ( �迭)
		int [] score = {1,2,3,4,5,6,7,8,9,10};
//		python�� ����Ʈ�� ������ ������ �����͸� ������ ����
//		java������ �迭�� �ϳ��� �ڷ����� �����͸� ������ ����
		System.out.println(score[5]);
		double [] d = {10.5,10.3,2.3,9.5};
//						 0	 1
//		�迭�� ����� ���� indexing�� �Ѵ�.
		System.out.println(d[1]);
//		�迭�� ��� �����͸� ���
		for(int i = 0; i <=3; i++) {
			System.out.println(d[i]);
		}
		
		
	}
}
