package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("이승무", 50));
		System.out.println(set.size());

		// Set에 객체 생성시 Iterator를 이용해 값을 가져온다
		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member m = iterator.next();
			if (m.getName().equals("이숭무")) {
				set.remove(m);
				break;
			}

		}System.out.println(set.size());

		for(Member m : set) {
			if (m.getName().equals("이숭무")) {
				set.remove(m);
				break;
			}
		}
		System.out.println(set.size());
		
		
		set.clear();
		System.out.println(set.isEmpty());
	}
}
