package homework.test04;

import java.util.Scanner;

//7.31 合并两个有序列表
public class ListSort {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list1:");
		int num1 = input.nextInt();
		int[] list1 = new int[num1];
		for(int i=0;i<num1;i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2:");
		int num2 = input.nextInt();
		int[] list2 = new int[num2];
		for(int i=0;i<num2;i++) {
			list2[i] = input.nextInt();
		}
		
		int[] list = merge(list1,list2);
		System.out.print("The merged list is");
		for(int i = 0; i < list.length; i++) {
			System.out.print(" " + list[i]);
		}
	}
	
	public static int[] merge(int[] list1,int[] list2) {
		int len = list1.length + list2.length;
		int[] list = new int[len];
		int temp1=0,temp2=0,temp=0;
		while(temp1 < list1.length && temp2 < list2.length) {
			if(list1[temp1] < list2[temp2]) {
				list[temp] = list1[temp1];
				temp++;
				temp1++;
			}else {
				list[temp] = list2[temp2];
				temp++;
				temp2++;
			}
		}
		while(temp1 < list1.length) {
			list[temp] = list1[temp1];
			temp++;
			temp1++;
		}
		while(temp2 < list2.length) {
			list[temp] = list2[temp2];
			temp++;
			temp2++;
		}
		
		return list;
	}
}
