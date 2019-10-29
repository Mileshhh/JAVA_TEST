package homework.test05;

public class TV {
	int channel = 1; //Default channel is 1
	int volumeLevel = 1;  //TV is off
	boolean on = false;  //TV is off
	
	public TV() {
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	//����Ƶ��
	public void setChannel(int newChannel) {
		if(on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
	//��������
	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}
	
	//����Ƶ��
	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}
	
	//����Ƶ��
	public void chanDown() {
		if (on && channel > 1) {
			channel--;
		}
	}
	
	//��������
	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	
	//��������
	public void volumeDown() {
		if (on && volumeLevel < 1) {
			volumeLevel--;
		}
	}
	
}
