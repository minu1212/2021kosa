package rutime_exception;

public class MultiEx {


	public static void main(String[] args) {
		int data1 = 0;
		int data2 = 0;
		try {
			data1 = Integer.parseInt(args[0]);
			data2 = Integer.parseInt(args[1]);
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data1 / data2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값이 2개가 필요합니다.");
		} catch (Exception e) {//Exception은 에러 클래스의 부모 클래스 모든 에러를 잡는다. 하위 예외들은 Exception보다 위에 작성하여야 예외처리가 가능하다.
			if (data2 == 0)
				System.out.println(0);
			else
				System.out.println(data1 / data2);
		}

	}
}


