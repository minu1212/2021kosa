
public class Ex12Test {
	public static void main(String[] args) {
		Ex12 ex12  = new Ex12();
		ex12.setFirst(20);
		ex12.setSecond(10);
//		ex12.add();//20+10 return
		//�޼ҵ� ȣ���� �̿��� ���
//		return�ڷ��� + ������ = ��ü��.�޼ҵ��();
		int result = ex12.add();//result�� �Լ� add()���� = 30
		System.out.println(result);
		
		result = ex12.sub();
		System.out.println(result);
		
		ex12.getName();
		String n = ex12.getName(); 
		System.out.println(n);
		
	}
}
