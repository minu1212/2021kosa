
public class Ex03Test { //static ��������(=Ŭ��������)
	public static void main(String[] args) {
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); // 0
		System.out.println(ex032.second);// 0
		System.out.println(ex032.val); //10
		System.out.println(Ex03.val);//instance ���� �ƴ� Ŭ������ ��밡��
		
		int result = ex031.add();
		System.out.println(result);
		result = ex032.add();
		System.out.println(result);
		
		//
		result = Ex03.sub();
		//�޼ҵ忡 staticŰ���忡�� Ŭ�������� �̿��ؼ� ����ϱ� ���� �żҵ��̴�.
		//Ŭ�������� ����ϱ� ������ �޼ҵ峻���� thisŰ���带 ����� �� ����.
		
	}
}
