
public class Ex14 {
	public static void main(String[] args) {
		//3행 4열인 2차원 배열에 1~100까지 사용하는 Math.random()을 이용하여 값을 입력한 후 합계를 출력하시오.
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
		
		//합계와 평균을 foreach문을 사용해서 구하시오.
		int [] score = {60,89,56,73,66,90,95};
		sum = 0;
		for(int num : score) {
			sum += num;
		}
		System.out.println("합계는 "+ sum);
		System.out.println("평균은 "+ sum / score.length);
		
	}
}
