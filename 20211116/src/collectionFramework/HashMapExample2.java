package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("�̼���",35);
		map1.put("�̻��",35);
		map1.put("�����",35);
		map1.put("�̱湫",35);
		
		//value������ �ڷ��� ���� int
		int age = map1.get("�̼���");
		System.out.println(age);
		
		//=========================================================
		
		Map<Integer,Double> map2 = new HashMap<Integer,Double>();
		map2.put(1,10.5);
		map2.put(2,10.5);
		map2.put(3,10.5);
		map2.put(4,10.5);
		//value������ �ڷ��� ���� double
		double d = map2.get(1);
		System.out.println(d);
		
		//==========================================================
		
		Map<String,Member> map = new HashMap<String,Member>();
		// Member��ü�� �̿��� value 
		map.put("�̼���",new Member("�̼���",30));
		map.put("�̻��",new Member("�̻��",15));
		map.put("�����",new Member("�����",18));
		map.put("�̱湫",new Member("�̱湫",85));
		
		//value������ �ڷ��� ���� Memder
		Member m = map.get("�̼���");
		System.out.println(m.getAge());
		
	}
}
