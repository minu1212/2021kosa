
public class Ex12Test {
	public static void main(String[] args) {
		Ex12 ex12  = new Ex12();
		ex12.setFirst(20);
		ex12.setSecond(10);
//		ex12.add();//20+10 return
		//메소드 호출을 이용한 출력
//		return자료형 + 변수명 = 객체명.메소드명();
		int result = ex12.add();//result에 함수 add()대입 = 30
		System.out.println(result);
		
		result = ex12.sub();
		System.out.println(result);
		
		ex12.getName();
		String n = ex12.getName(); 
		System.out.println(n);
		
	}
}
