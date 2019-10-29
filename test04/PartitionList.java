package homework.test04;

import java.util.Scanner;

//7.32 划分列表
public class PartitionList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int num = input.nextInt();
		int[] list = new int[num];
		for(int i = 0; i < num; i++) {
			list[i] = input.nextInt();
		}
		int index = partition(list);
	}
	
	public static int partition(int[] list) {
		int index = list[0];;
		int form = 0,behind = list.length-1;
		int[] newlist = new int[list.length];
		for(int i = 1; i < list.length; i++) {
			if(index >= list[i]) {
				newlist[form++] = list[i];
			}else {
				newlist[behind--] = list[i];
			}
		}
		newlist[form] = index;
		System.out.print("After the partition, the list is ");
		for(int i = 0; i < newlist.length; i++) {
			System.out.print(newlist[i] + " ");
		}
		return form;
	}
}
