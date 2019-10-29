package homework.test04;

import java.util.Scanner;

//7.19  «∑Ò≈≈∫√–Ú¡À
public class JudgeSorted {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list:");
		int length = input.nextInt();
		
		int[] list = new int[length];
		for(int i=0;i<length;i++) {
			list[i] = input.nextInt();
		}
		
		if(isSorted(list)) {
			System.out.println("The list is already sorted");
		}else {
			System.out.println("The list is not sorted");
		}
	}
	
	public static boolean isSorted(int[] list) {
		for(int i = 0;i<list.length-1;i++) {
			if(list[i] > list[i+1]) {
				return false;
			}
		}
		return true;
	}
}
