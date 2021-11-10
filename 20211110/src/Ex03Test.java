
public class Ex03Test { //static 전역변수(=클래스변수)
	public static void main(String[] args) {
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); // 0
		System.out.println(ex032.second);// 0
		System.out.println(ex032.val); //10
		System.out.println(Ex03.val);//instance 명이 아닌 클래스명 사용가능
		
		int result = ex031.add();
		System.out.println(result);
		result = ex032.add();
		System.out.println(result);
		
		//
		result = Ex03.sub();
		//메소드에 static키워드에는 클래스명을 이용해서 사용하기 위한 매소드이다.
		//클래스명을 사용하기 때문에 메소드내에서 this키워드를 사용할 수 없다.
		
	}
}
