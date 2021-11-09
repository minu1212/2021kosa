
public class Car {
	// 브랜드, 모델, 색, 스피드
	String brand;
	String model;
	String color;
	int maxSpeed;

	public Car() {

	}

	public Car(String brand, String model, String color, int maxSpeed) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

}
