
public class Ex10 {//this()공동코드 1
	String company;
	String model;
	String color;
	int maxspeed;
	
	public Ex10() {
		super();
	}

	public Ex10(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}
	
	public Ex10(String company, String model, String color) {
		//this()라는 메소드로 생성자를 호출↑ (호출하려는 생성자보다 위에 프로그래밍 하지않는 것이 좋다.)
		this(company,model);
//		this.company = company;
//		this.model = model;
		this.color = color;
	}
	
	public Ex10(String company, String model, int maxspeed) {
		this(company,model);
//		this.company = company;
//		this.model = model;
		this.maxspeed = maxspeed;
	}
		
	public Ex10(String company, String model, String color, int maxspeed) {
		this.company = company;
		this.color = color;
		this.maxspeed = maxspeed;
		this.model = model;
	}

	
}
