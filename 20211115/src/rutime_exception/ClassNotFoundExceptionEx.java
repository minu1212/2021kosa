package rutime_exception;

public class ClassNotFoundExceptionEx {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List1");
			System.out.println("Ŭ������ �ֽ��ϴ�");
		} catch (ClassNotFoundException e) {
			//System.out.println("Ŭ������ �����ϴ�");
			e.printStackTrace();//���� �޼��� ��� ���α׷� ���� x
			//�����ڰ� ��� �������� Ȯ���ϱ� ���� �ڵ�. ����ǵ� ���α׷��� ������� �ʴ´�.
		}
		
		System.out.println("���α׷� ��");
	}
}
