
public class Ex11 {//this()공동코드 2
	String company;
	String model;
	String color;
	int maxspeed;
	public Ex11() {
		super();
	}

	public Ex11(String company, String model) {//공통코드를 관리하는 생성자
		super();
		this.company = company;
		this.model = model;
	}
	
	public Ex11(String company, String model, String color) {
		this(company,model);
//		this.company = company; //공통코드
//		this.model = model;
		this.color = color;
	}
	
	public Ex11(String company, String model, int maxspeed) {
		this(company,model);
//		this.company = company; //공통코드
//		this.model = model;
		this.maxspeed = maxspeed;
	}
		
	
	
	public Ex11(String company, String model, String color, int maxspeed) {
		this.company = company;
		this.color = color;
		this.maxspeed = maxspeed;
		this.model = model;
	}

}
