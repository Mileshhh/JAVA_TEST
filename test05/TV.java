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
	
	//设置频道
	public void setChannel(int newChannel) {
		if(on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
	//设置音量
	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}
	
	//调高频道
	public void channelUp() {
		if (on && channel < 120) {
			channel++;
		}
	}
	
	//降低频道
	public void chanDown() {
		if (on && channel > 1) {
			channel--;
		}
	}
	
	//调高音量
	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	
	//降低音量
	public void volumeDown() {
		if (on && volumeLevel < 1) {
			volumeLevel--;
		}
	}
	
}
