
public class Ex14 {
	public static void main(String[] args) {
		//3�� 4���� 2���� �迭�� 1~100���� ����ϴ� Math.random()�� �̿��Ͽ� ���� �Է��� �� �հ踦 ����Ͻÿ�.
		int i [][] = new int [3][4];
		int sum = 0;
		for (int row = 0; row < i.length; row++) {
			for(int col = 0; col < i[row].length; col++) {
				int ran = (int)(Math.random()*100);
				i[row][col] = ran;
				System.out.println("i["+row+"]["+col+"]= "+i[row][col]);
				sum += i[row][col];
			}
		}System.out.println(sum);
		
		//�հ�� ����� foreach���� ����ؼ� ���Ͻÿ�.
		int [] score = {60,89,56,73,66,90,95};
		sum = 0;
		for(int num : score) {
			sum += num;
		}
		System.out.println("�հ�� "+ sum);
		System.out.println("����� "+ sum / score.length);
		
	}
}
