
public class Ex10 {
	public static void main(String[] args) {
		//대입연산자 : =
		int i = 10;
		System.out.println(i);
		i += 1;//(이항) // i =  i + 1, i++(일항)
		System.out.println(i);
		i += 2;// i = i + 2
		System.out.println(i);
		i -= 2;// i = i - 2
		System.out.println(i);
		i *= 2;// i = i * 2
		System.out.println(i);
		i /= 2;// i = i / 2
		System.out.println(i);
		i %= 3;// i = i % 3;
		System.out.println(i);
		
		int a,b,c ;
		a = b = c = 100;
		String str = "Hello" + "Java";
		System.out.println(str);
		String str1 = "Hello";
		String str2 = "Java";
		str = str1 + " " + str2;
		System.out.println(str);
		
		System.out.println("a, b ,c 는 " + 100);
		str = "3 * 7 = "+21; // 숫자가 문자열로 자동형변환됨
		System.out.println(str);
		
		//삼항 연산자 ( 조건문 ? true : false)
		i = 70;
		System.out.println(i > 60 ? "합격" : "불합격" );
		/* if ( i < 60){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		*/
		
	}
}
