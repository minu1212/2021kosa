package multi_implement;

public interface Searchable {//�������̽��� abstract�� ���� �ʾƾƵ� byte�ڵ� �����Ͻÿ� class ���Ͽ��� �ڵ����� �پ�����.
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void search(String url);
	
	
	
}
