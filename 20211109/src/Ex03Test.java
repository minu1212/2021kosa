
public class Ex03Test {
	public static void main(String[] args) {
//		ex03 = Ex03() - ���̽㿡�� ����ϴ� ���
		Ex03 ex03 = new Ex03();
		
		ex03.setData(20, 10);
//		ex03.first = 20, ex03.second = 10;
		
		ex03.add();
		System.out.println(ex03.result);
		
		ex03.sud();
		System.out.println(ex03.result);
		
		Ex03 ex003 = new Ex03();
		ex003.setData(200, 100);
		ex003.sud();
		System.out.println(ex003.result);
	}
	
	
}
