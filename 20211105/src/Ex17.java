
public class Ex17 {
	public static void main(String[] args) {
		// 1~100������ ���� ���ϴ� �� ¦���� ���Ͻÿ�
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
