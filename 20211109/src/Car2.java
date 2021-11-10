
public class Car2 {//생성자 오버로딩 3 this()
	String model;
	String color;
	int maxspeed;
	
	/* 공통코드
	 * this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	 */
	public Car2 (String model) {
		this(model,"흰색",250);
		/*
		this.model = model;
		this.color = "흰색";
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
