
public class DmbCellPhoneTest {
	public static void main(String[] args) {
		DmbCellPhone ex = new DmbCellPhone("�ڱ���", "����", 5);
		// �θ�� ���� ��ӹ��� �޼ҵ� ���
		ex.powerOn();
		ex.bell();
		ex.sendVoice("��������");
		ex.receiveVoice("�̼��� �� �³���");
		ex.sendVoice("�ȳ��ϼ���");
		ex.hangUp();

		// �ڽ� Ŭ���� �޼ҵ� ����
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();
	}
}
