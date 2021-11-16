package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("이숭무",35);
		map1.put("이상범",35);
		map1.put("이장범",35);
		map1.put("이길무",35);
		
		//value값으로 자료형 선언 int
		int age = map1.get("이숭무");
		System.out.println(age);
		
		//=========================================================
		
		Map<Integer,Double> map2 = new HashMap<Integer,Double>();
		map2.put(1,10.5);
		map2.put(2,10.5);
		map2.put(3,10.5);
		map2.put(4,10.5);
		//value값으로 자료형 선언 double
		double d = map2.get(1);
		System.out.println(d);
		
		//==========================================================
		
		Map<String,Member> map = new HashMap<String,Member>();
		// Member객체를 이용한 value 
		map.put("이숭무",new Member("이숭무",30));
		map.put("이상범",new Member("이상범",15));
		map.put("이장범",new Member("이장범",18));
		map.put("이길무",new Member("이길무",85));
		
		//value값으로 자료형 선언 Memder
		Member m = map.get("이숭무");
		System.out.println(m.getAge());
		
	}
}
