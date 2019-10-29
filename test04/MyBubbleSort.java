package homework.test04;

import java.util.Scanner;

//7.18 冒泡排序
public class MyBubbleSort {
	public static void main(String[] args) {
		double[] list = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		double number;
		
		//将输入的十个数存入数组中
		for(int i=0;i<10;i++) {
			number = input.nextDouble();
			list[i] = number;
		}
		//进行排序
		BubbleSort(list);
		
		//打印排序后的数组
		for(double i :list) {
			System.out.print(i + " ");
		}
	}
	
	//冒泡排序
	public static void BubbleSort(double[] list) {
		double temp;
		for(int i = 0;i<list.length;i++) {
			for(int j = 0;j<list.length - i - 1;j++) {
				if(list[j] > list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}
	}

}

