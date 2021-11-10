
public class Ex02Test {
	public static void main(String[] args) {
		int i = 10;
//		cal = calulator(); 
//		cal.first = 10
		
//		자료형 변수명 = new 클래스명();
		Ex02 ex02 = new Ex02(); 
		ex02.addr = "성남";
		ex02.age = 20;
		ex02.name = "조민우";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.age);
		System.out.println(ex02.name);
		System.out.println(ex02.gender);

		//다른 객체 만들기 가능
		Ex02 ex021 = new Ex02();
		ex021.addr = "성남";
		ex021.age = 20;
		ex021.gender = false;
		ex021.name = "김규연";
		System.out.println(ex021.addr);
		System.out.println(ex021.age);
		System.out.println(ex021.name);
		System.out.println(ex021.gender);

		
	}
}
