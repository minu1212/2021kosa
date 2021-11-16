package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import StringClass.StringMethod;

public class ArrayListExample {

	public static void main(String[] args) {
		// java의 리스트는 배열의 단점 크기가 지정되어 있음을 보완한 것
		String str[] = { "나는", "자바", "너무", "좋아요" };
		System.out.println(str.length);// 배열의 크기는 한계가 있다.

		str[3] = "참좋아요";
//		str[4] = "."; index = 3

		// list는 크기가 유동적이다. but 배열과 같이 같은 타입만 저장이 가능하다.
		List list = new ArrayList();// python list 와 비슷하다. python = 모든자료형 저장가능, java = 한가지 자료형만 저자가능
		list.add("이숭무");
		list.add("이상범");
		list.add("이장범");
		list.add(1);

		System.out.println(list.get(0));// list에서 꺼내올때는 get을 사용한다.
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("==================");
		for (int i = 0; i < list.size(); i++) {// list의 length()는 size()
			System.out.println(list.get(i));
		}
		System.out.println("==================");
		for (Object s : list) {// 배열안에 있는 값이 타입을 모르기 때문에 오류발생
			System.out.println(s);
		}

		// 배열안의 타입을 모르는 오류를 해결하기 위해 타입을 String으로 지정해주었다
		List<String> list1 = new ArrayList<String>();
		list1.add("이숭무");
		list1.add("이장범");
		list1.add("이상범");

		System.out.println("==================");
		for (String s : list1) {
			System.out.println(s);
		}

		int i = 10;
		String st = "이숭무";
		double i1 = 10.5;
		Object obj = 10;
		obj = "test";
		obj = 10.5;		
		obj = new Calu();
		//부모객체는 자식객체에서 만들어진 객체를 사용하지 못하므로
		//다운캐스팅
		Calu calu = (Calu)obj;
		calu.setFirst(10);
		System.out.println(calu);
		
		
				
	}

}
