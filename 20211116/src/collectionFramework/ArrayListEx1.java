package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
//		�ڷ��� ������ = new �ڷ���();
		List list = new ArrayList();
		list.add(new Board("����1", "����1", "�۾���1"));
//		1, new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(1, new Board("����4", "����4", "�۾���4"));
		for (int i = 0; i < list.size(); i++) {
			// Object Ÿ���϶��� �������´�.
			System.out.println(list.get(i));
		}
		
		System.out.println("==================");

//		for (int i = 0; i < list.size(); i++) {
//			String s = (String) list.get(i);
//			System.out.println(s);
//		}
		//���ʸ� Ÿ���� ���� ���
		for (int i = 0; i < list.size(); i++) {
			Board b = (Board) list.get(i);
			System.out.println(b.getContent());
		}
		System.out.println("==================");

		// Board = ���ʸ� Ÿ��
		List<Board> list1 = new ArrayList<Board>();
		list1.add(new Board("����1", "����1", "�۾���1"));
		list1.add(new Board("����2", "����2", "�۾���2"));
		list1.add(new Board("����3", "����3", "�۾���3"));
		list1.add(new Board("����4", "����4", "�۾���4"));
		
		//���ʸ� Ÿ���� �ִ� ���
		for (int i = 0; i < list1.size(); i++) {
			Board b1 = list1.get(i);
			System.out.println(b1.getContent());
		}
	}
}
