
public class Test1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand(args[0]);
		car.setModel(args[1]);
		car.setColor(args[2]);
		car.setMaxSpeed(Integer.parseInt(args[3]));
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
		System.out.println(car.getModel());
	}
}
