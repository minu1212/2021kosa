package rutime_exception;

public class NullPointException {
	public static void main(String[] args) {
		Point point = null;//��ü�������� ���� = nullpoint
		
		try {
			point.print();
		}catch (NullPointerException e) {
			point = new Point();
			point.print();
		}
		
		
	}
}

class Point{
	public void print() {
		System.out.println("���");
	}
}
