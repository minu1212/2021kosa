
public class Ex14 {
	//클래스(객체) 내부에서는 "필드이름"으로 바로접근 - Ex13Test
	//클래스(객체) 외부에서는 "변수.필드이름"으로 접근
	int result;
	int first;
	int second;
	int add; //변수 (= add()는 함수 이다. java에서는 ()로 구분하기 때문에 같은이름의 함수와 변수가 존재할수있지만 python은 불가)
	//this 가 없고 이름이 같다면 누가 매개변수이고 멤버필드인지를 구별할수 없게된다.(이름이 다르다면 this를 사용하지 않아도 된다.)
	
	/*
	public Ex14(int first, int second) {
		first = first;
		second = second;
	}
	
	public Ex14(int num1, int num2) {
		first = num1;
		second = num2;
	}
	*/
	
	// 메소드(Method)의 4가지 유형
	
	

	public Ex14(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	//1.I1O1 입력값이 있고(=매개변수가 있다.) 출력값(=반환형이 있다.= return을 한다.)이 있는 메소드
	public int add(int num1 ,int num2) {
		return num1 + num2 ;
	}
	
	//2.I1O0 입력값이 있고(=매개변수가 있다.) 출력값이 없는(=반환형이 없다 = void = return을 하지 않는다.) 메소드
	public void sub(int num1, int num2) {
		this.result = num1 - num2;
		System.out.println(this.result);
	}
	
	//3.I0O1 입력값은 없고(=매개변수가 없다.=입력값이 어딘가에는 존재해야한다.) 출력값은 있는(=반환영이 있다 = return을 한다.) 메소드
	public int mul() {
		return this.first * this.second;
	}
	
	//4.I0O0 입력값이 없고(=매개변수가 없다.) 출력값이 없는(=반환형이 없다. = return을 하지 않는다.) 함수
	public void div() {
		// 메소드 호출시에 점프하여 div메소드안의 코드를 수행한 후 생성자로 받아온 값 출력
		System.out.println( this.first/this.second );
	}
	
	// ====================================================================================================
	
	//메소드 오버로딩(Method Overloading) (메소드의 이름은 같으나 매개변수의 타입,갯수,순서가 다른 것으로 선언하여 호출.)
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	
	
	/*
	public void sub(double num1, int num2) {// O
		this.result = num1 - num2;
	}
	
	public void sub(int num1, double num2) {// O
		this.result = num1 - num2;
	}
	*/
	
	//반환형이 다른 것이 아닌 매개변수가 달라야함.
	/*
	public int sub(int num1, int num2) {// X
		return 0;
	}
	public int div(int num2, int num1) {// X - 타입은 같으나 매개변수의 이름이 다르다고 해서 오버로딩이라고 볼수없다.
		return num1 / num2;
	}
	*/
}
