package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//기본자료형, String, Wrapper(Integer...), 배열, (class, 객체,)=개발자가 만드는 자료형 list, set, map
public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("이숭무");// 순서에 영향을 받지 않는다., python의 set 자료형(집합 자료형)
		set.add("이상범");
		set.add("이충무");
		set.add("이길무");
//		set.add("이길무"); 같은 값은 저장되지 않는다.

		int size = set.size();
		System.out.println(size);

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s);
		}

		System.out.println("==============");

		for (String s : set) {
			System.out.println(s);
		}
	}
}
