package homework.test04;

import java.util.Scanner;

//7.18 ð������
public class MyBubbleSort {
	public static void main(String[] args) {
		double[] list = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		double number;
		
		//�������ʮ��������������
		for(int i=0;i<10;i++) {
			number = input.nextDouble();
			list[i] = number;
		}
		//��������
		BubbleSort(list);
		
		//��ӡ����������
		for(double i :list) {
			System.out.print(i + " ");
		}
	}
	
	//ð������
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

