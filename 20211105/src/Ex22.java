import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է����ּ���. : ");
		String name = sc.next();
		System.out.println("�ȳ��ϼ��� "+name+"��");
		System.out.print("����� ���̴�? : ");
		int num1 = sc.nextInt();
		System.out.println("����� ���̴� "+num1+"�̱���");
		*/
		//���� : �ܰ� ���� ������ �Է¹޾� �������� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		int Sdan = sc.nextInt();
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		int Edan = sc.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		int Sgop = sc.nextInt();
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		int Egop = sc.nextInt();
				
		int dan;	
		for(dan = Sdan;dan <= Edan; dan++) {
			int gop;
			for(gop = Sgop; gop <= Egop; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
}
