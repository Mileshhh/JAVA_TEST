package homework.test04;

//7.34 ¶Ô×Ö·û´®ÖÐµÄ×Ö·ûÅÅÐò
public class StringSort {
	public static void main(String[] args) {
		String str = "adfsafabadc";
		System.out.print(sort(str));
	}
	
	public static String sort(String s) {
		char temp;
		String stotal = "";
		char[] str = s.toCharArray();
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str.length - 1 - i; j++) {
				if(str[j] > str[j+1]) {
					temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < str.length; i++) {
			stotal += str[i];
		}
		return stotal;
		
	}
}
