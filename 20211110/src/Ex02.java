import javax.security.sasl.SaslException;

public class Ex02 {//매개변수 생성자 사용 이해

	public static void main(String[] args) {
		//정수 리스트
		int i [] = new int [3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		//
		int i1 = 10;
		int i2 = 10;
		int i3 = 10;
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		
		
		
		//Account 리스트
		Account [] accs = new Account[3];
		//매개변수가 있는 생성자 사용
		accs[0] = new Account("1111","이숭무",100); //멤버초기화0
		accs[1] = new Account("2222","이숭무",100); //멤버초기화1
		
		//string 리스트
		String [] str = new String[3];
		str[0] = "이숭무";
		str[0] = "이장범";
		
	}
}
