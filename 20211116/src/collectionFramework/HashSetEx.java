package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("�̽¹�", 50));
		System.out.println(set.size());

		// Set�� ��ü ������ Iterator�� �̿��� ���� �����´�
		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member m = iterator.next();
			if (m.getName().equals("�̼���")) {
				set.remove(m);
				break;
			}

		}System.out.println(set.size());

		for(Member m : set) {
			if (m.getName().equals("�̼���")) {
				set.remove(m);
				break;
			}
		}
		System.out.println(set.size());
		
		
		set.clear();
		System.out.println(set.isEmpty());
	}
}
