package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map �÷���
public class HashMapExample {
	public static void main(String[] args) {
		// python ��ųʸ��� ���� key(Ű), value(��)�� �̷���� �ִ�.
//		�÷����� value�� , Map�� key�� value
		List<String> list = new ArrayList<String>();
		list.add("�̸���");
//		Map<key,value>     ������  = new HashMap<key,value>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		// ��ü ����,���� (������.put(key,value))
		map.put("�̼���", 35);
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 69);
		map.put("���屺", 80);
		map.put("�̼���", 55);
		// key�� ������ value ���� key�� ������ ����
		map.put("�̼���", 16);
		// Map�� ũ�� ���(�ߺ� Ű ��� x, 5 x ,4 O)
		System.out.println("Map�� ũ��� : " + map.size());
		// ��ü ���(������.get(key))
		System.out.println("�̼����� ���̴� ? : " + map.get("�̼���") + "���Դϴ�.");

		// Set�ڷ����� Ȱ���� Map�ڷ����� key��ü ��������
		Set<String> keySet = map.keySet();// key�� �����ϸ� Set�ڷ������� �����´�.
		for (String key : keySet) {
			System.out.println(key + "�� ���̴� " + map.get(key) + "���Դϴ�.");
		}

		// Iterator(=�ݺ���)�� Ȱ���� Map�ڷ����� key��ü �������� 
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}

		System.out.println("===================");

		// �� ���� ����
		map.remove("ȫ�浿");
		System.out.println(map.size());

		// �� ���� ����
		map.clear();
		System.out.println(map.size());

		// map�ȿ� ���� �ִ����� booleanŸ������ ���
		System.out.println(map.isEmpty());
	}

}
