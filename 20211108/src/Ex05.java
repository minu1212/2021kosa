
public class Ex05 {
	public static void main(String[] args) {
		//�迭�� ũ�� ��������(�迭��.length)
		int i [] = new int[] {1,2,3,4,5};
		System.out.println(i.length);
		//�迭�� �ִ� ���� �հ踦 ���Ͻÿ�.
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		System.out.println("==================");
		
		// ũ�Ⱑ 10�� �迭�� ����� math.random�� �̿��Ͽ� �迭�� ���� ���� �����Ͻÿ�.
		int j [] = new int[10] ; 
		for(int k = 0; k < j.length; k++) {
			j[k]= (int)(Math.random()*100)+1;
			System.out.println(j[k]);
		}		
		sum = 0;
		for(int k = 0; k < j.length; k++ ) {
			
			sum += j[k];
		}System.out.println(sum);
	
		
	}
}
