
public class Car2 {//������ �����ε� 3 this()
	String model;
	String color;
	int maxspeed;
	
	/* �����ڵ�
	 * this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	 */
	public Car2 (String model) {
		this(model,"���",250);
		/*
		this.model = model;
		this.color = "���";
		this.maxspeed = 250;
		*/
	}
	
	public Car2(String model, String color) {
		this(model,color,230);
		/*
		this.model = model;
		this.color = color;
		this.maxspeed = 230;
		*/
	}

	public Car2(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
}
