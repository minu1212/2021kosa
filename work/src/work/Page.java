package work;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PageR [] pas = new PageR[100];
		//�迭�� �����ȣ�� ������ ���� ����
		
		boolean run = true;
		int pasnum = 0;
		int reader = 0;
		int num = 0;
		do {
			System.out.println("�۸��");
			System.out.println("��ȣ\t\t�۾���\t\t����\t\t������");
			for (int i = 0; i < pas.length; i++) {
				if(pas[i]==null) {
					System.out.println(" "); break;
				}else {
				System.out.println(pas[i].pasnum +".\t\t"+pas[i].name+"\t\t"+pas[i].head+"\t\t"+pas[i].reader );
				}
			}
			System.out.println(" ");
			System.out.println("=================");
			System.out.println(" �۾��� 1 | �󼼺��� 2 ");
			System.out.print("��ȣ ���� > ");
			String selecNo = sc.nextLine();
			
			
			switch (selecNo) {

			case "1": 
				pasnum = pasnum+1;
				reader = 0;
				System.out.println("�� �ۼ� �������Դϴ�.");
				System.out.print("�۾��� : ");
				String name = sc.nextLine();
				System.out.print("���� : ");
				String head = sc.nextLine();
				System.out.print("���� : ");
				String content = sc.nextLine();
				
				System.out.println("�����Ϸ��� y �ٽ� ������ n�� ��������");
				String select = sc.nextLine();
				
				
				if(select == "y") {
					pas[num] = new PageR(pasnum, reader, name, head, content);
					num++;
					break;
				}else if(select == "n") {
					continue;
				}
					
				
				
						
			
			
			case "2": 
				System.out.print("������� �Խñ��� ��ȣ�� �Է� �ϼ��� : ");
				int n = sc.nextInt();
				System.out.println(pas[n-1].pasnum);
				System.out.println(pas[n-1].name);
				System.out.println(pas[n-1].head);
				System.out.println(pas[n-1].content);
				reader++;
				pas[n-1].reader = reader;
				
				System.out.println("==================");
				System.out.println("������� ���� : 1 | ���� : 2 | ���� : 3");
				int select1 = sc.nextInt();
				if(select1 == 1) {
					break;	
				}else if(select1 == 2) {
					System.out.println("�� �ۼ� �������Դϴ�.");
					System.out.print("�۾��� : ");
					String name1 = sc.nextLine();
					System.out.print("���� : ");
					String head1 = sc.nextLine();
					System.out.print("���� : ");
					String content1 = sc.nextLine();
					
					System.out.println("�����Ϸ��� y �ٽ� ������ n�� ��������");
//					String select = sc.nextLine();
					
					pas[n-1].name = name1;
					pas[n-1].head = head1;
					
				}
				
				
			}
		} while (run);

	}
}

