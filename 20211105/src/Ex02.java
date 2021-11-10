
public class Ex02 {
	public static void main(String[] args) {//random, switch case문
//		Math.random() : 0 <= Math.random() < 1
 		int num = (int)(Math.random()*5)+1; //(0 ~ 4) + 1 int = 소숫점이하자리 자르기
 		System.out.println(num);
 		if (num == 1) {
 			System.out.println('A');
 		}else if(num == 2){
 			System.out.println('B');
 		}else if(num == 3) {
 			System.out.println('C');
 		}else if(num == 4) {
 			System.out.println('D');
 		}else if(num == 5) {
 			System.out.println('E');
 		}//...
// 		else if(num == 100) {
// 			syso
// 		}
// 		if 문은 위에서 부터 차곡차곡 비교하기 때문에 프로그램이 길 경우 성능이 저하된다 
// 		그반면 Switch case문은 순서대로 비교하는 것이 아닌 값을 찾아서 실행한다.
 		System.out.println("==============Swich case==============");
		
		switch(num){
			case 1:System.out.println('A');break;
			case 2:System.out.println('B');break;
			case 3:System.out.println('C');break;
			case 4:System.out.println('D');break;
			case 5:System.out.println('E');break;
		}
	}
}
