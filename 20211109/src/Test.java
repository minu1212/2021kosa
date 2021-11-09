
public class Test {
	public static void main(String[] args) {
		Board bd = new Board(1, "제목", "상장범아빠", "내용", "192.168.0.100", 2);
		System.out.println("제목 : " + bd.getSubject());
		System.out.println("글쓴이 : " + bd.getWriter());
		System.out.println("내용 : " + bd.getContent());
		System.out.println("ip : " + bd.getIp());
		System.out.println("방문자 수 : " + bd.getReaderCount());
		
		Car car = new Car("현대", "소나타", "검정", 240);
		Car car1 = new Car();
		car1.setColor("흰색");
		car1.setBrand("기아");
		car1.setModel("K7");
		car1.setMaxSpeed(250);
		System.out.println(car1.getBrand());
		System.out.println(car1.getColor());
		System.out.println(car1.getMaxSpeed());
		System.out.println(car1.getModel());
	
	}
}
