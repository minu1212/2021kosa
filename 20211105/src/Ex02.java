
public class Ex02 {
	public static void main(String[] args) {//random, switch case��
//		Math.random() : 0 <= Math.random() < 1
 		int num = (int)(Math.random()*5)+1; //(0 ~ 4) + 1 int = �Ҽ��������ڸ� �ڸ���
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
// 		if ���� ������ ���� �������� ���ϱ� ������ ���α׷��� �� ��� ������ ���ϵȴ� 
// 		�׹ݸ� Switch case���� ������� ���ϴ� ���� �ƴ� ���� ã�Ƽ� �����Ѵ�.
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
