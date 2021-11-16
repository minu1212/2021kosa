package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
	public static void main(String[] args) {
//		자료형 변수명 = new 자료형();
		List list = new ArrayList();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
//		1, new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(1, new Board("제목4", "내용4", "글쓴이4"));
		for (int i = 0; i < list.size(); i++) {
			// Object 타입일때는 못가져온다.
			System.out.println(list.get(i));
		}
		
		System.out.println("==================");

//		for (int i = 0; i < list.size(); i++) {
//			String s = (String) list.get(i);
//			System.out.println(s);
//		}
		//제너릭 타입이 없는 경우
		for (int i = 0; i < list.size(); i++) {
			Board b = (Board) list.get(i);
			System.out.println(b.getContent());
		}
		System.out.println("==================");

		// Board = 제너릭 타입
		List<Board> list1 = new ArrayList<Board>();
		list1.add(new Board("제목1", "내용1", "글쓴이1"));
		list1.add(new Board("제목2", "내용2", "글쓴이2"));
		list1.add(new Board("제목3", "내용3", "글쓴이3"));
		list1.add(new Board("제목4", "내용4", "글쓴이4"));
		
		//제너릭 타입이 있는 경우
		for (int i = 0; i < list1.size(); i++) {
			Board b1 = list1.get(i);
			System.out.println(b1.getContent());
		}
	}
}
