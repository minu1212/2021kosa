package multi_implement;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//�߻� �޼ҵ�
	void turnOn();
	void turnoff();
	void setVolume(int volume);
}
