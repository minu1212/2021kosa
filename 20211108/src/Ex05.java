
public class Ex05 {
	public static void main(String[] args) {
		//배열의 크기 가져오기(배열명.length)
		int i [] = new int[] {1,2,3,4,5};
		System.out.println(i.length);
		//배열에 있는 값의 합계를 구하시오.
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		System.out.println("==================");
		
		// 크기가 10인 배열을 만들고 math.random을 이용하여 배열에 임의 값을 저장하시오.
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
