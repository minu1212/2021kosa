package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedLisstEx {// List의 종류와 나노타임을 이용한 속도비교
	public static void main(String[] args) {//속도,성능 차이
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> list3 = new Vector<String>();

		long startTime;
		long endTime;

		//ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간 : " + (endTime - startTime) + "ns");

		//LinkedList
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간 : " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		
		//Vector
		for (int i = 0; i < 10000; i++) {
			list3.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간 : " + (endTime - startTime) + "ns");

	}
}
