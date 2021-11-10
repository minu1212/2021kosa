
public class Ex14Test {
	public static void main(String[] args) {
		Ex14 ex14 = new Ex14(50, 20);
//		1.입력값이 있고 출력값이 있는 메소드
		int num = ex14.add(20, 10);
		System.out.println(num);
		
		//2.입력값이 있고 출력값이 없는 메소드
//		int num = ex14.sub(20, 10);//반환값이 없으므로 에러 == 대입불가 - 반환값이 없으므로 메소드 안에서 실행
		ex14.sub(30, 15);
		
		//3.입력값이 없고 출력값이 있는 메소드
		num = ex14.mul();//매개변수가 없으므로 입력값이 없음
		System.out.println(num);
		
		//4.입력값이 없고 출력값이 없는 메소드
//		num = ex14.div() // 출력값이 없으므로 대입 불가
//		ex14.div(30, 15); // 매개변수가 없으므로 입력 불가
		ex14.div();//메소드 내부에서 자동실행 후 출력까지 완료
		
		//변수 add와 함수add()
		ex14.add = 10;
		System.out.println(ex14.add);//()가 없으므로 add는 변수 = 10
	}
}
