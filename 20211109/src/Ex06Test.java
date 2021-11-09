
public class Ex06Test {
	public static void main(String[] args) {// 멤버필드의 초기화 2가지 방법, setter,생성자(클래스이름과 동일하게 선언)
//		Ex06 ex06 = new Ex06();
		//변수선언 
		Ex06 ex06;
		
		//객체생성
		ex06 = new Ex06(); 
		
		//멤버 필드의 초기화
		ex06.setDate("이숭무", 35, 175.5);//setter
		String name = ex06.getName();//getter
		
		//멤버 필드 값 가져오기
		System.out.println(name);
		
		//객체생성과 동시에 멤버필드 초기화하기 : 생성자(클래스이름과 동일하게)
//	    변수선언(Ex061) + 객체생성(ex061) + 멤버필드의 초기화("이숭무", 35, 175.5)
		Ex061  ex061 = new Ex061("이숭무", 35, 175.5);
		
		//객체 생성시에  생성자가 자동으로 실행.
		System.out.println(ex061.getAge()); //this.age값 출력
		
		
	}
}
