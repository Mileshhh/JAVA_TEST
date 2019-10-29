package homework.test03;

public class RandomCharacter {
	
	//����һ����ch1��ch2֮�������ַ�
	public static char getRandomCharacter(char ch1,char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	//����һ����a��z֮�������ַ�
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a','z');
	}
	
	//����һ����A��Z֮�������ַ�
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A','Z');
	}
	
	//����һ����0��9֮�����������ַ�
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0','9');
	}
	
	//����һ������
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000','\uFFFF');
	}
}
