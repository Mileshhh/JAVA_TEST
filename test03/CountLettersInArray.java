package homework.test03;

public class CountLettersInArray {
	//������
	public static void main(String[] args) {
		char[] chars = createArray();
		
		//��ӡ����
		System.out.println("The lowercase letters are:");
		displayArray(chars);
		
		//���ַ������Ϊ��������
		int[] counts = countLetters(chars);
		
		System.out.println();
		System.out.println("The occurrences of each letter are:");
		displayCounts(counts);
	}

	//�½�һ���ַ���������
	public static char[] createArray() {
		//����һ���ַ����鲢����
		char[] chars = new char[100];
		//�����鸳ֵa-z�����һ���ַ�
		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		return chars;
	}
	
	//����ַ������е��ַ�
	public static void displayArray(char[] chars) {
		for(int i = 0; i < chars.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.println(chars[i]);
			}else {
				System.out.print(chars[i] + " ");
			}
		}
	}
	
	//����ÿ���ַ�����ֵ
	private static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		
		//��ÿ���ַ�ת��Ϊ����
		for(int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}
		return counts;
	}
	
	//������������е�ÿ������
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
