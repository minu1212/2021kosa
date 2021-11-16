package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import StringClass.StringMethod;

public class ArrayListExample {

	public static void main(String[] args) {
		// java�� ����Ʈ�� �迭�� ���� ũ�Ⱑ �����Ǿ� ������ ������ ��
		String str[] = { "����", "�ڹ�", "�ʹ�", "���ƿ�" };
		System.out.println(str.length);// �迭�� ũ��� �Ѱ谡 �ִ�.

		str[3] = "�����ƿ�";
//		str[4] = "."; index = 3

		// list�� ũ�Ⱑ �������̴�. but �迭�� ���� ���� Ÿ�Ը� ������ �����ϴ�.
		List list = new ArrayList();// python list �� ����ϴ�. python = ����ڷ��� ���尡��, java = �Ѱ��� �ڷ����� ���ڰ���
		list.add("�̼���");
		list.add("�̻��");
		list.add("�����");
		list.add(1);

		System.out.println(list.get(0));// list���� �����ö��� get�� ����Ѵ�.
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("==================");
		for (int i = 0; i < list.size(); i++) {// list�� length()�� size()
			System.out.println(list.get(i));
		}
		System.out.println("==================");
		for (Object s : list) {// �迭�ȿ� �ִ� ���� Ÿ���� �𸣱� ������ �����߻�
			System.out.println(s);
		}

		// �迭���� Ÿ���� �𸣴� ������ �ذ��ϱ� ���� Ÿ���� String���� �������־���
		List<String> list1 = new ArrayList<String>();
		list1.add("�̼���");
		list1.add("�����");
		list1.add("�̻��");

		System.out.println("==================");
		for (String s : list1) {
			System.out.println(s);
		}

		int i = 10;
		String st = "�̼���";
		double i1 = 10.5;
		Object obj = 10;
		obj = "test";
		obj = 10.5;		
		obj = new Calu();
		//�θ�ü�� �ڽİ�ü���� ������� ��ü�� ������� ���ϹǷ�
		//�ٿ�ĳ����
		Calu calu = (Calu)obj;
		calu.setFirst(10);
		System.out.println(calu);
		
		
				
	}

}
