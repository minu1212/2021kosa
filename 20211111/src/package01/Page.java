package package01;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PageR pas [] = new PageR[100];
		int pasnum = 0;
		do {
			System.out.println("�۸��");
			System.out.println("��ȣ\t\t�۾���\t\t����\t\t������");
			System.out.println("");
			System.out.println("=================");
			System.out.println("1. �۾��� | 2. �󼼺��� ");
			System.out.print("��ȣ ���� > ");
			String selecNo  = sc.nextLine();
			switch (selecNo) {
			
			case "1":{
			System.out.println("�� �ۼ� �������Դϴ�.");		
			System.out.print("�۾��� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			String head = sc.nextLine();
			System.out.print("���� : ");
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
