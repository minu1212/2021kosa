
public class Ex061 {
	String name;
	int age;
	double height;

	// 자바에서는 클래스이름과 생성자명이 같아야 한다. 일반 함수와 값이 리턴형식(반환형)이 없어야 한다,(ex void, int,... )
	//python에서는 생성자는 하나 java에서는 생성자가 여러개이다.
		
//  생성자
//	접근지정자 클래스명(매개변수1,....)
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("생성자 실행");
	}
//	 	메서드(Method) : class안에 있는 함수 
//	 	접근지정자+반환형+함수명 + (매개변수){
		
//		}

	
	// setter
	// void : 반환형 - 반환할 값이 없다.
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
	//int : 반환형 - 정수형 값을 반환
	public int getAge() {
		return this.age; 
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;			
	}
}
