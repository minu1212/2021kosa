package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("이숭무"); // Object
		list.add("이상범");
		list.add("이장범");
		list.add("이장범");//list에서는 값은 값도 저장된다.
		list.set(3,"이길무");//list에 있느 값 수정

		// 보통이렇게 사용
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}

		// 이렇게 사용하지 않는다
		// Object타입이 저장이 되었을 경우 그대로 사용하는 것이 아닌 변환하여 사용한다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 어떤 타입으로 사용할지 지정된경우↓ 그냥 사용하고 아니라면 꼭 형변환을 하여 사용한다.
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

		// list에 있는 값을 삭제(remove(index),remove(Object),removeALL,isEmpty)
		list1.remove(0);// index를 지정하는 방식 list1.size()= -1
		list.remove("이상범");// Object를 지정하는 방식
		list1.add(3);
		System.out.println(list1);
		System.out.println(list);
		System.out.println("-----");
		list1.removeAll(list1);//list내에 값을 모두 삭제
		System.out.println(list1);
		System.out.println(list.isEmpty());//list내에 값이 비어있는지를 boolean타입으로 출력
			
		System.out.println("=================");

	}
}
