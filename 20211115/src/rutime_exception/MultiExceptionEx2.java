package rutime_exception;

public class MultiExceptionEx2 {
 
		static int data1 = 0;
		static int data2 = 0;

		public static void main(String[] args) {
			try {
				data1 = Integer.parseInt(args[0]);
				data2 = Integer.parseInt(args[1]);
				System.out.println(data1);
				System.out.println(data2);
				System.out.println(data1 / data2);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("입력값이 2개가 필요합니다.");
			} catch (ArithmeticException e) {
				if (data2 == 0)
					System.out.println(0);
				else
					System.out.println(data1 / data2);
			}catch (NumberFormatException e) { //NumberFormatException : 숫자로 변환이 되지 않습니다.
				System.out.println("숫자를 입력해주세요");
			}

		}
}
