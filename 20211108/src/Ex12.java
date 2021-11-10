
public class Ex12 {
	public static void main(String[] args) {
		//4행 5열짜리 배열을 만들어 Math.random()을 이용하여 값을 저장하시오.
		int i [][] = new int [4][5];

		for(int row = 0; row < i.length; row++) {
			for(int col = 0; col < i[row].length; col++) {
				int ran = (int)(Math.random()*100);
				i[row][col]=ran;
				System.out.println("i["+row+"]["+col+"] : "+i[row][col]);
			}
		}
	}
}
