
public class DmbCellPhone extends CellPhone {
	int channel;
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel  = channel;
	}
	public void turnOnDmb() {
		System.out.println("ä��" + channel + " �Դϴ�.");
	}
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + " �Դϴ�.");
	}
	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}