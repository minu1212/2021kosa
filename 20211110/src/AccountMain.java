import java.util.Scanner;//�ڵ� import ctrl + shift + O

public class AccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		Account acc = new Account("1111","�̽¹�",100);
		Account acc1 = new Account("2222","�̻��",100);
		Account acc2 = new Account("3333","�����",100);
		*/
		
		//�迭�� ���� ��ȣ�� ������ ���� ����
		int arrayNum = 0;
		
		
		//100���� ���� ��� ����
		Account []accs = new Account[100];
		boolean run = true;
		
//		while(run) { //���ѹݺ���
		do { //do ~ while��
			System.out.println("1. ���� ��� | 2. ���� ���"+" | 3. ���� | 4. ��� | 5. ����");
			System.out.print("���� > ");
			String selecNo  = sc.nextLine();
			
			//Scanner�� ���������� �޾ƿ� ��� enter�� \n���� ����ؾ��� �׷��� nextline�� �߰��ؾ� �־�� ��.
			//�������� ��� \n������ �޾ƿ´�.
//			int selecNo = sc.nextInt();
//			sc.nextLine(); // �Է���ġ��  \n���� �ִ� ���� ���ֱ� ���� ���
			
			//		sc.next.. �ڷ����� �°� �ٲ�
			switch(selecNo) {
			case "1":
				System.out.println("���µ�� �������Դϴ�.");
				System.out.print("���� ��ȣ : ");
				String accountNo = sc.nextLine();
				System.out.print("������ : ");
				String owner = sc.nextLine();
				System.out.print("�ݾ� : ");
				int money = sc.nextInt();
				
				//accs[0]�� ��ü����
				accs[arrayNum] = new Account(accountNo, owner, money);
				arrayNum++;
				System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.\n");
				break;
				
			case "2":
				//��� ���� ���
				System.out.println("���¸�� �������Դϴ�.");
				System.out.println("���¹�ȣ \t\t ������ \t\t �ݾ�");
				for (int i = 0; i < accs.length; i++) {
					//���̻� ��ϵ� ���°� ���ٸ� �����.
					if(accs[i]==null)break;
					System.out.println(accs[i].getAccountNo() + "\t\t" + accs[i].getOwner() + "\t\t" + accs[i].getBalance());
				}
				break;
			case "3":
				System.out.println("���� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = null;
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null)break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {//accs[i]��° ���� ������ ���¹�ȣ�� �Է��� ���¹�ȣ�� ���ٸ�.
							acc = accs[i];
							//acc =accs[i], acc = accs[1],....
							break;
						}
					}
				}
				
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println();
				break;
			case "4":
				System.out.println("��� �������Դϴ�.");
				System.out.print("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null)break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {//accs[i]��° ���� ������ ���¹�ȣ�� �Է��� ���¹�ȣ�� ���ٸ�.
							acc = accs[i];
							//acc =accs[i], acc = accs[1],....
							break;
						}
					}
				}
				
				result = acc.getBalance() - money;
				acc.setBalance(result);
				break;
			case "5":
				run = false;
//				System.exit(0);//���α׷� ����
			}
//		}
		}while(run);
	}
	public static void accountPrint() {
		
	}
}
