package rutime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	//�Ű������� animal�� �ְԵǸ� �������� �̿��� dog,cat�Ѵ� ���� �� �ִ�.
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			
			try{
				Cat dog  = (Cat) animal;//�ٿ�ĳ����
			}catch(ClassCastException e){
				System.out.println("�Էµ� ��ü�� �߸��Ǿ����ϴ�.");
			}
			
		}
	}
}

/*public* X */ class Animal{}
//resource location�� ������ class������ �ΰ��� ������� �� �� �ִ�
class Dog extends Animal{}
class Cat extends Animal{}

