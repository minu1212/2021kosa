
public class Ex11 {//this()�����ڵ� 2
	String company;
	String model;
	String color;
	int maxspeed;
	public Ex11() {
		super();
	}

	public Ex11(String company, String model) {//�����ڵ带 �����ϴ� ������
		super();
		this.company = company;
		this.model = model;
	}
	
	public Ex11(String company, String model, String color) {
		this(company,model);
//		this.company = company; //�����ڵ�
//		this.model = model;
		this.color = color;
	}
	
	public Ex11(String company, String model, int maxspeed) {
		this(company,model);
//		this.company = company; //�����ڵ�
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
