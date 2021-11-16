package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("�̼���"); // Object
		list.add("�̻��");
		list.add("�����");
		list.add("�����");//list������ ���� ���� ����ȴ�.
		list.set(3,"�̱湫");//list�� �ִ� �� ����

		// �����̷��� ���
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}

		// �̷��� ������� �ʴ´�
		// ObjectŸ���� ������ �Ǿ��� ��� �״�� ����ϴ� ���� �ƴ� ��ȯ�Ͽ� ����Ѵ�.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// � Ÿ������ ������� �����Ȱ��� �׳� ����ϰ� �ƴ϶�� �� ����ȯ�� �Ͽ� ����Ѵ�.
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		for (Object obj : list) {
			String s = (String) obj;
			System.out.println(s);
		}

		System.out.println("=================");

		// list�� �ִ� ���� ����(remove(index),remove(Object),removeALL,isEmpty)
		list1.remove(0);// index�� �����ϴ� ��� list1.size()= -1
		list.remove("�̻��");// Object�� �����ϴ� ���
		list1.add(3);
		System.out.println(list1);
		System.out.println(list);
		System.out.println("-----");
		list1.removeAll(list1);//list���� ���� ��� ����
		System.out.println(list1);
		System.out.println(list.isEmpty());//list���� ���� ����ִ����� booleanŸ������ ���
			
		System.out.println("=================");

	}
}
