
public class EX14 {
	public static void main(String[] args) {
//		i = 0 			#1
//		while i <= 9:   #2
//			print(i)	#3
//			i += 1		#4  => i = 1...10
//		1>/2>3>4/>/2>3>4/>2>3>4...4
		
//		for���� �������
//			    #1	     #2	   #4
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * "+i+" = "+5*i);   //#3
		}
		//1>2>3>4>/2>3>4/>/2>3>4/...>2
		int i = 1; //#1
		for(;i <= 9;) {// #2
			System.out.println("5 * "+i+" = "+5*i);   //#3
			i++; //#4
		}
		System.out.println("==================while===============");
		i = 1;//#1
		while(i <= 9) {//#2
			System.out.println("5 * "+i+" = "+5*i); //#3   
			i++;//#4
		}
		System.out.println("=================");
		System.out.println("while������ 3�� �� 3���� 7������ ���");
		i = 3;
		while(i <= 7){
			System.out.println("3 * "+ i +" = "+ 3 * i);
			i++;
		}
		
	}
}
