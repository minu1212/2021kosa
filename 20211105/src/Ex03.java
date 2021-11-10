
public class Ex03 {
	public static void main(String[] args) {//switch case문
//		8단출력
		int num = (int)(Math.random()*9)+1;
		if(num == 1) {
			System.out.println("8 * 1 = 8");
		}else if(num == 2) {
			System.out.println("8 * 2 = 16");
		}else if(num == 3) {
			System.out.println("8 * 3 = 24");
		}else if(num == 4) {
			System.out.println("8 * 4 = 32");
		}else if(num == 5) {
			System.out.println("8 * " + num + " = " + 8*num);
		}else if(num == 6) {
			System.out.println("8 * " + num + " = " + 8*num);
		}else if(num == 7) {
			System.out.println("8 * " + num + " = " + 8*num);
		}else if(num == 8) {
			System.out.println("8 * " + num + " = " + 8*num);
		}else if(num == 9) {
			System.out.println("8 * 2 = 72");
		}
		
		System.out.println("==============================");
		
		switch(num) {
			case 1:System.out.println("8 * 1 = "+8*num);break;
			case 2:System.out.println("8 * 2 = "+8*num);break;
			case 3:System.out.println("8 * 3 = "+8*num);break;
			case 4:System.out.println("8 * 4 = "+8*num);break;
			case 5:System.out.println("8 * 5 = "+8*num);break;
			case 6:System.out.println("8 * 6 = "+8*num);break;
			case 7:System.out.println("8 * 7 = "+8*num);break;
			case 8:System.out.println("8 * 8 = "+8*num);break;
			case 9:System.out.println("8 * 9 = "+8*num);break;
		}
	}
}