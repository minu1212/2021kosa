
public class Ex13 {
	public static void main(String[] args) {
		//for each : for�� Ȯ��
		int[]i = {1,2,3,4,5};
		int sum = 0;
		//�հ踦 ���Ͻÿ�.
		for(int j = 0; j <i.length; j++) {
			sum += i[j];
		}System.out.println(sum);
		
		System.out.println("================");
		
		sum = 0;//for each �� : �迭�� ũ�⸸ŭ �ݺ��Ͽ� ���� �ϳ��� �������ڴ�.(�迭�� ũ�⸦ ���� ��.)
		for(int k : i ) {//k = i[0], k=i[1], k=[2],...k=i[4]
			sum += k;
		}System.out.println(sum);
		
		System.out.println("================");
		
		int ii[][] = {{1,2,3,4},{5,6},{7,8,9,10,11}};
		sum = 0;
		for(int row = 0; row < ii.length; row++) {
			for(int col = 0; col < ii[row].length; col++) {
				sum += ii[row][col];
			}
		}System.out.println(sum);
		
		System.out.println("==================");
		
		sum = 0;
		for(int [] row : ii) { //row = ii[0]...ii[2]
			for(int col : row) {//col = [0][0],...col = ii[0][2]
				sum += col;
			}
		}System.out.println(sum);
	}	
}
