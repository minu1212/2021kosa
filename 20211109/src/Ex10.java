
public class Ex10 {//this()�����ڵ� 1
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
		//this()��� �޼ҵ�� �����ڸ� ȣ��� (ȣ���Ϸ��� �����ں��� ���� ���α׷��� �����ʴ� ���� ����.)
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
