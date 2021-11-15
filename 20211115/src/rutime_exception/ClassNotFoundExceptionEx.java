package rutime_exception;

public class ClassNotFoundExceptionEx {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List1");
			System.out.println("클래스가 있습니다");
		} catch (ClassNotFoundException e) {
			//System.out.println("클래스가 없습니다");
			e.printStackTrace();//에러 메세지 출력 프로그램 종료 x
			//개발자가 어떠한 오류인지 확인하기 위한 코드. 실행되도 프로그램은 종료되지 않는다.
		}
		
		System.out.println("프로그램 끝");
	}
}
