package homework.test04;

import java.util.Scanner;

//7.5 打印不同的数
public class DifferentNumber {
	public static void main(String[] args) {
		int i,j;
		
		//定义一个长度为10，值都为0的一维数组
		int[] distinct = new int[10];
		for(i=0;i<10;i++) {
			distinct[i] = 0;
		}
		
		//新数的个数
		int length = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		int number = input.nextInt();
		distinct[0] = number;
		int flag = 1;
		for(j = 0;j < 9;j++) {
			flag = 1;
			for(i = 0;i<length;i++) {
				if(number == distinct[i]) {
					flag = 0;
					break;
				}
			}
			
			if(flag == 1) {
				distinct[length++] = number;
			}
			number = input.nextInt();
		}
		System.out.println("The number of distinct number is " + length);
		System.out.print("The distinct numbers are:");
		for(i=0;i<length;i++) {
			System.out.print(distinct[i] + " ");
		}
	}
}
