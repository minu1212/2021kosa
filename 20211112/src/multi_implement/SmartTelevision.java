package multi_implement;

import interface_declaration.RemoteControl;

public class SmartTelevision implements RemoteControl,Searchable {//�������̽��� ���߻���� �����ϴ�.
	//�ʵ�
	private int volume;

	
	
	@Override
	public void turnOn() {
		System.out.println("Television�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Television�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		//������ ������ ���� ��� ������ ���� �ʾƵ� ���ǵ� ������ ó�� ��
		
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}
	
}
