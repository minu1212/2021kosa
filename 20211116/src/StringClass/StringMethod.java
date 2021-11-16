package StringClass;

public class StringMethod {
	public static void main(String[] args) {
		String ssn = "102225-3465852";
		// 0102...
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1':
		case '3':
			System.out.println("����");
			break;
		case '2':
		case '4':
			System.out.println("����");
			break;
		}

		System.out.println(ssn.charAt(7));
		String str = "���� �ڹٰ� �ʹ� ����־��";
		// 0 12345 6 789101234
		System.out.println(str.charAt(10));
		// charAt():index�� �ش��ϴ� ���ڸ� ������

			
		System.out.println("===============");
		
		// Method ����
		String str1 = "apple";
		boolean b1 = str1.startsWith("a");// ���ڿ��� ������ ù���� �������� ��ȯ
		System.out.println("startWith : "+b1);
		b1 = str1.startsWith("le");
		System.out.println(b1);

		b1 = str1.endsWith("le");
		System.out.println(b1);// true

		str = new String("java");
		str1 = new String("java");
		System.out.println(str1 == str); // false
		System.out.println(str1.equals(str));// true

		str1 = "I like the java";
		// 012345678901234
		System.out.println(str1.indexOf("t"));// 7
		System.out.println(str.indexOf("a"));
//		System.out.println(str.rindexOf("a")); //python
		System.out.println(str.lastIndexOf("a"));
		
		System.out.println(str1.length());
		int[] i1 = new int[5];
		System.out.println(i1.length);
		
		str1 = "I like the java";
		int start = str1.indexOf("t");
		System.out.println(start); // 7
		System.out.println(str1.substring(start, start + 8));

		// ���� ����
		System.out.println(str1.replace("I", "i"));
		// ����ǥ���� �ش��ϴ� ���ڸ� ����
		System.out.println(str1.replace("I", "You"));

		// python = split �� ����Ʈ�� ����
		// java���� split �迭�� ����
		str = "A:B:C:D:abcd";
		String[] str2 = str.split(":");
		System.out.println(str2[1]);
		
		str = "A:B:C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[1]);
		
		str = "A B C D abcd";
		str2 = str.split(" ");
		System.out.println(str2[1]);

		// python slicing : a = "abcdef" : a[1:3]
		// java substring = python slicing
		str1 = "abcdef";
		System.out.println(str1.substring(1, 3));

		str1 = "abcDEF";
		System.out.println(str1.toLowerCase());// �ҹ���
		System.out.println(str1.toUpperCase());// �빮��

		Integer i = 10;
		str = "10" + i.toString();// ���ڸ� ���ڷ� �����ϰ��� �Ҷ� ��� toString
		System.out.println(str);

		// ���� �������� trim python = strip
		str1 = " abc DEF ";
		System.out.println(str1.trim());

	
		
		
	}
}
