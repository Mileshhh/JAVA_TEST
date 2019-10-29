package homework.test04;

import java.util.Scanner;

//7.3 计算数字的出现次数
public class NumberTimes {
	public static void main(String[] args) {
		int[] total = new int[100];
		for(int i=0;i<100;i++) {
			total[i] = 0;
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100:");
		int number = input.nextInt();
		while(number != 0) {
			total[number-1]++;
			number = input.nextInt();
		}
		for(int i=0;i<100;i++) {
			if(total[i]==1) {
				System.out.println(i+1 + " occurs " + total[i] + " time");
			}else if (total[i] > 1) {
				System.out.println(i+1 + " occurs " + total[i] + " times");
			}
		}
	}
}
