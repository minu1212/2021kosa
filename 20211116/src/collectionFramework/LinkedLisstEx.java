package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedLisstEx {// List�� ������ ����Ÿ���� �̿��� �ӵ���
	public static void main(String[] args) {//�ӵ�,���� ����
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> list3 = new Vector<String>();

		long startTime;
		long endTime;

		//ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("�ɸ� �ð� : " + (endTime - startTime) + "ns");

		//LinkedList
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("�ɸ� �ð� : " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		
		//Vector
		for (int i = 0; i < 10000; i++) {
			list3.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("�ɸ� �ð� : " + (endTime - startTime) + "ns");

	}
}
