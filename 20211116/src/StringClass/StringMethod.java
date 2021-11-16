package StringClass;

public class StringMethod {
	public static void main(String[] args) {
		String ssn = "102225-3465852";
		// 0102...
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		System.out.println(ssn.charAt(7));
		String str = "나는 자바가 너무 재미있어요";
		// 0 12345 6 789101234
		System.out.println(str.charAt(10));
		// charAt():index에 해당하는 문자를 가져옴

			
		System.out.println("===============");
		
		// Method 정리
		String str1 = "apple";
		boolean b1 = str1.startsWith("a");// 문자열을 넘으면 첫글자 참거짓을 반환
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

		// 문자 변경
		System.out.println(str1.replace("I", "i"));
		// 정규표현에 해당하는 문자를 변경
		System.out.println(str1.replace("I", "You"));

		// python = split → 리스트로 저장
		// java에서 split 배열로 저장
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
		System.out.println(str1.toLowerCase());// 소문자
		System.out.println(str1.toUpperCase());// 대문자

		Integer i = 10;
		str = "10" + i.toString();// 숫자를 문자로 변경하고자 할때 사용 toString
		System.out.println(str);

		// 양쪽 공백제거 trim python = strip
		str1 = " abc DEF ";
		System.out.println(str1.trim());

	
		
		
	}
}
