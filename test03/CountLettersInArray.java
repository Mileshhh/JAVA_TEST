package homework.test03;

public class CountLettersInArray {
	//主函数
	public static void main(String[] args) {
		char[] chars = createArray();
		
		//打印数组
		System.out.println("The lowercase letters are:");
		displayArray(chars);
		
		//将字符数组变为整型数组
		int[] counts = countLetters(chars);
		
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}

	//新建一个字符类型数组
	public static char[] createArray() {
		//定义一个字符数组并创建
		char[] chars = new char[100];
		//给数组赋值a-z中随机一个字符
		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		return chars;
	}
	
	//输出字符数组中的字符
	public static void displayArray(char[] chars) {
		for(int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.println(chars[i]);
			}else {
				System.out.print(chars[i] + " ");
			}
		}
	}
	
	//计算每个字符的数值
	private static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		
		//把每个字符转换为数字
		for(int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}
		return counts;
	}
	
	//输出整型数组中的每个数字
	private static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if((i + 1) % 10 == 0) {
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			}else {
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
			}
		}
	}
}
