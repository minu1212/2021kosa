
public class Ex12 {
	public static void main(String[] args) {
		/*num = 1 :전역변수
		 * def test():
		 * 		num = 100 : 지역변수 = 블럭변수(자바)
		 * 		print(num)
		 * 
		 * test()
		 * print(num)
		 */
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			int a = 10;
			//변수 i,a를 블럭변수라고 함.
		}
//		System.out.println(i); // 블럭변수(지역변수)는 블럭바깥에서는 사용할 수 없다.
//		System.out.println(a);
		int num;
		for (num = 1; num <= 10; num++) {
			System.out.println(num);
			//블럭밖에 있는 변수 num은 블럭안에서 사용가능하다.
		}
		System.out.println(num);
		
	}
}
