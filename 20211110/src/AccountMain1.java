import java.util.Scanner;

public class AccountMain1 {
	static Account []accs = new Account[100];
	static Scanner sc = new Scanner(System.in);
	static int arrayNum = 0;
	static boolean run = true;
	
	public static void main(String[] args) {
		/*
		Account acc = new Account("1111","이승무",100);
		Account acc1 = new Account("2222","이상범",100);
		Account acc2 = new Account("3333","이장범",100);
		*/
		
		//배열의 현재 번호를 가지기 위한 변수
		
		
//		while(run) { //무한반복문
		do { //do ~ while문
			System.out.println("1. 계좌 등록 | 2. 계좌 목록"+" | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.print("선택 > ");
			String selecNo  = sc.nextLine();
			
			//Scanner를 정수형으로 받아올 경우 enter의 \n까지 출력해야함 그래서 nextline을 추가해야 주어야 함.
			//문자형의 경우 \n까지도 받아온다.
//			int selecNo = sc.nextInt();
//			sc.nextLine(); // 입력장치의  \n값이 있는 것을 없애기 위해 사용
			
			//		sc.next.. 자료형에 맞게 바뀜
			switch(selecNo) {
			case "1":
				System.out.println("계좌등록 페이지입니다.");
				
				System.out.print("계좌 번호 : ");
				String accountNo = sc.nextLine();
				
				System.out.print("예금주 : ");
				String owner = sc.nextLine();
				
				System.out.print("금액 : ");
				int money = sc.nextInt();
				
				arrayNum++;
				
				System.out.println("계좌 등록이 완료되었습니다.\n");
				break;
				
			case "2":
				//모든 계좌 출력
				System.out.println("계좌목록 페이지입니다.");
				System.out.println("계좌번호 \t\t 계좌주 \t\t 금액");
				
				accountPrint();
				
				break;
			case "3":
				System.out.println("예금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.println("예금액 : ");
				money = Integer.parseInt(sc.nextLine());
				
				Account acc = accountFind(accountNo);

				
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println();
				break;
			case "4":
				System.out.println("출금 페이지입니다.");
				System.out.print("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.println("예금액 : ");
				money = Integer.parseInt(sc.nextLine());
				
				acc = accountFind(accountNo);

				
				result = acc.getBalance() - money;
				acc.setBalance(result);
				break;
			case "5":
				run = false;
//				System.exit(0);//프로그램 종료
			}
//		}
		}while(run);
	}
	
	public static Account accountFind(String accountNo) {
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null)break;
			else {
				if(accs[i].getAccountNo().equals(accountNo)) {//accs[i]번째 에서 가져온 계좌번호와 입력한 계좌번호가 같다면.
					return accs[i];
				}
			}
		}
		return null;//else 일때도 return 값 필요 
	}
	
	public static void accountPrint() {
		for (int i = 0; i < accs.length; i++) {
			//더이상 등록된 계좌가 없다면 멈춰라.
			if(accs[i]==null)break;
			
			System.out.println(accs[i].getAccountNo() + "\t\t" + accs[i].getOwner() + "\t\t" + accs[i].getBalance());
		}
	}
}

