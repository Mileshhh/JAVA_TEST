package homework.test03;

public class RandomCharacter {
	
	//返回一个在ch1和ch2之间的随机字符
	public static char getRandomCharacter(char ch1,char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	//返回一个在a和z之间的随机字符
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a','z');
	}
	
	//返回一个在A和Z之间的随机字符
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A','Z');
	}
	
	//返回一个在0和9之间的随机数字字符
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0','9');
	}
	
	//返回一个数字
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000','\uFFFF');
	}
}
