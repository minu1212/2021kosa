
public class Ex07Test {
	public static void main(String[] args) {
		//Ex07 ex07 = new ������
		Ex07 ex07 = new Ex07(10, 20);
		ex07.add();
		System.out.println(ex07.getResult());
		
		Ex07 ex071 = new Ex07(); //defalt ������
		ex071.setFirst(100);
		ex071.setSecond(50);
		
		//defalt ������ : �����ڰ� ������ �ڵ����� ��������� ������.
		//				�⺻���� �����ϴ� ������.
		//				�����ڰ� �ٸ� �����ڸ� ����� defalt(�⺻) �����ڴ� �ڵ����� ��������� �۴´�.
		Ex071 ex007 = new Ex071();//defalt ������ (�����ڸ� �������� �ʾƵ� �ڵ����� �����Ǿ� ����)
		ex007.setFirst(30);
		System.out.println(ex007.getFirst());
	} 
	
}
