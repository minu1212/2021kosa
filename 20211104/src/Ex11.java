
public class Ex11 {
	public static void main(String[] args) {
		/* Python
		 * if ���ǽ� :
		 * 		��ɹ� 1
		 * 		...
		 * 
		 * Java
		 * if(���ǽ�){
		 * 		��ɹ� 1
		 * 		...
		 * }
		 * 
		 * �ڹٿ����� �鿩���⸦ ������� �ʾƵ� ������ �������� ���̱� ���ؼ� ����Ѵ�.
		 * ��ɹ��� �ϳ��� ��� �߰�ȣ ��������
		 */
		
		int i = 10;
		if ( i < 20) 
			System.out.println("�۴�.");
		
		if ( i == 10) {
			System.out.print("i�� ");
			System.out.println("10���� �۴�");
			System.out.println("...");
		}
		
		int money = 3000;
		//���� 3000���� �ʰ��ϸ� ���� Ÿ�� ���ÿ�.
		if (money > 3000) 
			System.out.println("���� Ÿ�� ���ÿ�");
			System.out.println("if���� ����Ǿ����ϴ�.");
		
		if (money > 3000) {
			System.out.println("���� Ÿ�� ���ÿ�");
		}
			System.out.println("if���� ����Ǿ����ϴ�.");

		if (money > 3000) {
			System.out.println("���� Ÿ�� ���ÿ�");
			System.out.println("if���� ����Ǿ����ϴ�.");
		}
				
		

	}
}