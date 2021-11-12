package package01;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PageR pas [] = new PageR[100];
		int pasnum = 0;
		do {
			System.out.println("글목록");
			System.out.println("번호\t\t글쓴이\t\t제목\t\t읽은수");
			System.out.println("");
			System.out.println("=================");
			System.out.println("1. 글쓰기 | 2. 상세보기 ");
			System.out.print("번호 선택 > ");
			String selecNo  = sc.nextLine();
			switch (selecNo) {
			
			case "1":{
			System.out.println("글 작성 페이지입니다.");		
			System.out.print("글쓴이 : ");
			String name = sc.nextLine();
			System.out.print("제목 : ");
			String head = sc.nextLine();
			System.out.print("내용 : ");
			String content = sc.nextLine();
			
			pas [pasnum] = new PageR( name, head, content);
			pas [pasnum+1] = new PageR( name, head);
			pasnum++;
			break;
			}
			case "2":{
				
			}
			
				
			}
		}while(true);
		
	}
}
