
public class Ex06 {//cmd���� �����ϱ�.
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		//args�� �̿��ؼ� ���ϴ� ���� ������ ����Ͻÿ�.
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		for ( int i = start; i <= end; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " * "+j+" = "+i*j);
			}
		}
	}
}
