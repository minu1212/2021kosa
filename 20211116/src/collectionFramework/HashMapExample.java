package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map 컬렉션
public class HashMapExample {
	public static void main(String[] args) {
		// python 딕셔너리와 같이 key(키), value(값)로 이루어져 있다.
//		컬렉션은 value만 , Map은 key와 value
		List<String> list = new ArrayList<String>();
		list.add("이만용");
//		Map<key,value>     변수명  = new HashMap<key,value>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 객체 저장,수정 (변수명.put(key,value))
		map.put("이숭무", 35);
		map.put("신용권", 85);
		map.put("홍길동", 69);
		map.put("동장군", 80);
		map.put("이숭무", 55);
		// key가 있으면 value 수정 key가 없으면 저장
		map.put("이숭무", 16);
		// Map의 크기 출력(중복 키 허용 x, 5 x ,4 O)
		System.out.println("Map의 크기는 : " + map.size());
		// 객체 출력(변수명.get(key))
		System.out.println("이숭무의 나이는 ? : " + map.get("이숭무") + "살입니다.");

		// Set자료형을 활용한 Map자료형의 key전체 가져오기
		Set<String> keySet = map.keySet();// key를 추출하면 Set자료형으로 가져온다.
		for (String key : keySet) {
			System.out.println(key + "의 나이는 " + map.get(key) + "살입니다.");
		}

		// Iterator(=반복기)을 활용한 Map자료형의 key전체 가져오기 
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}

		System.out.println("===================");

		// 값 선택 삭제
		map.remove("홍길동");
		System.out.println(map.size());

		// 값 전제 삭제
		map.clear();
		System.out.println(map.size());

		// map안에 값이 있는지를 boolean타입으로 출력
		System.out.println(map.isEmpty());
	}

}
