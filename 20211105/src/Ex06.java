
public class Ex06 {// String.equals
	public static void main(String[] args) {
		String location = "서울";
		if (location.equals("서울")) {// if(location == "서울")
			System.out.println("서울 버스 요금은 1350원입니다.");
		}else if(location.equals("인천")) {// if(location == "인천")
			System.out.println("인천 버스 요금은 1400원입니다.");
		}else if(location.equals("성남") ) {// if(location == "성남")
			System.out.println("성남 버스 요금은 1450원입니다.");
		}
		
		System.out.println("=======================================");
		
		switch(location) {
		case "서울":System.out.println("서울 버스요금은 1350원입니다.");break;
		case "인천":System.out.println("인천 버스요금은 1400원입니다.");break;
		case "성남":System.out.println("성남 버스요금은 1450원입니다.");break;
		}
	}
}
