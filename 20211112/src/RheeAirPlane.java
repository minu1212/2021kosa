
public class RheeAirPlane extends Airplane{
	static final int NORMAL = 1;//�Ϲݺ���
	static final int SUPERSONIC = 2; //������ ����
	
	int flyMode = NORMAL; // 1
	
	public void fly() {//�������̵�
		if(flyMode == SUPERSONIC) {
			System.out.println("������ ������ �Ѵ�.");
		}else {
			super.fly();
		}
	}
	
}
