package work;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PageR [] pas = new PageR[100];
		//배열의 현재번호를 가지기 위한 변수
		
		boolean run = true;
		int pasnum = 0;
		int reader = 0;
		int num = 0;
		do {
			System.out.println("글목록");
			System.out.println("번호\t\t글쓴이\t\t제목\t\t읽은수");
			for (int i = 0; i < pas.length; i++) {
				if(pas[i]==null) {
					System.out.println(" "); break;
				}else {
				System.out.println(pas[i].pasnum +".\t\t"+pas[i].name+"\t\t"+pas[i].head+"\t\t"+pas[i].reader );
				}
			}
			System.out.println(" ");
			System.out.println("=================");
			System.out.println(" 글쓰기 1 | 상세보기 2 ");
			System.out.print("번호 선택 > ");
			String selecNo = sc.nextLine();
			
			
			switch (selecNo) {

			case "1": 
				pasnum = pasnum+1;
				reader = 0;
				System.out.println("글 작성 페이지입니다.");
				System.out.print("글쓴이 : ");
				String name = sc.nextLine();
				System.out.print("제목 : ");
				String head = sc.nextLine();
				System.out.print("내용 : ");
				String content = sc.nextLine();
				
				System.out.println("저장하려면 y 다시 쓰려면 n을 누르세요");
				String select = sc.nextLine();
				
				
				if(select == "y") {
					pas[num] = new PageR(pasnum, reader, name, head, content);
					num++;
					break;
				}else if(select == "n") {
					continue;
				}
					
				
				
						
			
			
			case "2": 
				System.out.print("보고싶은 게시글의 번호를 입력 하세요 : ");
				int n = sc.nextInt();
				System.out.println(pas[n-1].pasnum);
				System.out.println(pas[n-1].name);
				System.out.println(pas[n-1].head);
				System.out.println(pas[n-1].content);
				reader++;
				pas[n-1].reader = reader;
				
				System.out.println("==================");
				System.out.println("목록으로 가기 : 1 | 수정 : 2 | 삭제 : 3");
				int select1 = sc.nextInt();
				if(select1 == 1) {
					break;	
				}else if(select1 == 2) {
					System.out.println("글 작성 페이지입니다.");
					System.out.print("글쓴이 : ");
					String name1 = sc.nextLine();
					System.out.print("제목 : ");
					String head1 = sc.nextLine();
					System.out.print("내용 : ");
					String content1 = sc.nextLine();
					
					System.out.println("저장하려면 y 다시 쓰려면 n을 누르세요");
//					String select = sc.nextLine();
					
					pas[n-1].name = name1;
					pas[n-1].head = head1;
					
				}
				
				
			}
		} while (run);

	}
}

