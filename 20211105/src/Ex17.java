
public class Ex17 {
	public static void main(String[] args) {
		// 1~100까지의 합을 구하는 데 짝수만 더하시오
		int sum = 0;
		for (int i = 0; i<=100; i++) {
			if (i % 2 == 0)sum = sum + i;
		}System.out.println(sum);
		
		sum = 0;
		int i = 1;
		while (i <= 100) {
			if(i%2 == 0) sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		sum = 0;
		i = 1;
		while(true) {
			if (i % 2 == 0)sum = sum + i;
			i++;
			if(i==101)break;
		}
		System.out.println(sum);
	}
}
