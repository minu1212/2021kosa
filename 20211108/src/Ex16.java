
public class Ex16 {
	public static void main(String[] args) {
		WEEK1 today = WEEK1.�����;
		System.out.println(today);//������ ���
		String name = today.name();//���ڿ�
		System.out.println(name);
		
		//������ ����� ������ �ִ� �������� ������ ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		WEEK1 day1 = WEEK1.�����;
		WEEK1 day2 = WEEK1.ȭ����;
		
		int result = day1.compareTo(day2);
		System.out.println(result);//2�� ��
		result = day2.compareTo(day1);
		System.out.println(result);//2�� ��
		
//		���ڿ��� ���������� ��ȯ
		String day = "������";
		WEEK1 weekday = WEEK1.valueOf(day);
		System.out.println(weekday);//������ ���
		//�������� �ִ� ��� ����� ��������
		
		System.out.println("===============");
		
		WEEK1 day3 = WEEK1.�ݿ���;
		//������ �����״� ������ ��� �ϳ��� ����ȴ�.
		WEEK1 [] days = WEEK1.values();//������ ����� �迭�� ��ȯ
		for (WEEK1 w : days) {
			System.out.println(w);
		}
		
	}
}
