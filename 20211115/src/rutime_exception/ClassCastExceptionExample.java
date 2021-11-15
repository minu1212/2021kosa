package rutime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	//매개변수를 animal롤 주게되면 다형성을 이용해 dog,cat둘다 받을 수 있다.
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			
			try{
				Cat dog  = (Cat) animal;//다운캐스팅
			}catch(ClassCastException e){
				System.out.println("입력된 객체가 잘못되었습니다.");
			}
			
		}
	}
}

/*public* X */ class Animal{}
//resource location을 들어가보면 class파일이 두개가 생긴것을 볼 수 있다
class Dog extends Animal{}
class Cat extends Animal{}

