
public class Ex07Test {
	public static void main(String[] args) {
		//Ex07 ex07 = new 생성자
		Ex07 ex07 = new Ex07(10, 20);
		ex07.add();
		System.out.println(ex07.getResult());
		
		Ex07 ex071 = new Ex07(); //defalt 생성자
		ex071.setFirst(100);
		ex071.setSecond(50);
		
		//defalt 생성자 : 생성자가 없으면 자동으로 만들어지는 생성자.
		//				기본으로 존재하는 생성자.
		//				개발자가 다른 생성자를 만들면 defalt(기본) 생성자는 자동으로 만들어지지 앟는다.
		Ex071 ex007 = new Ex071();//defalt 생성자 (생성자를 생성하지 않아도 자동으로 생성되어 있음)
		ex007.setFirst(30);
		System.out.println(ex007.getFirst());
	} 
	
}
