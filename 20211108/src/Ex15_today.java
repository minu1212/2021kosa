import java.util.Calendar;

public class Ex15_today {//열거형 변수
	public static void main(String[] args) {
		WEEK today;//열거형 상수 변수 선언
		today = WEEK.MONDAY; //변수에 열거형 상수값 대입
		System.out.println(today);
		
		//사용 예
		//Calendar 는 날짜를 사용하기 위한 자료형이다.
		Calendar cal = Calendar.getInstance();
		//요일을 가지고 오자.
		int week = cal.get(Calendar.DAY_OF_WEEK);//DAY_OF_WEEK = Calendar 자료형안의 열거형 상수
		System.out.println(week);//2 : 월요일
		System.out.print("오늘의 요일은 : ");
		switch(week){
			case 1: today = WEEK.SUNDAY; 	break;
			case 2: today = WEEK.MONDAY; 	break;
			case 3: today = WEEK.THURSDAY; 	break;
			case 4: today = WEEK.WEDNESDAY; break;
			case 5: today = WEEK.TUESDAY; 	break;
			case 6: today = WEEK.FRIDAY; 	break;
			case 7: today = WEEK.SATURDATY; break;
		}
		System.out.println(today);
		if (today == WEEK.SUNDAY) {
			System.out.println("나는 놀러가요");
		}else {
			System.out.println("열심히 일을 합니다.");
		}
	}
}
