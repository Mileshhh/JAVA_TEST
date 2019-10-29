package homework.test04;

import java.util.Scanner;

//7.17 ∂‘—ß…˙≈≈–Ú
public class StudentSort {
	public static void main(String[] args) {
		System.out.print("Enter the number of student:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Enter the name and score of student:");
		String[] name = new String[num];
		int[] score = new int[num];
		for (int i=0;i<num;i++) {
			name[i] = input.next();
			score[i] = input.nextInt();
		}
		int temp;
		String ntemp;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i - 1; j++) {
				if(score[j] > score[j+1]) {
					temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
					ntemp = name[j];
					name[j] = name[j+1];
					name[j+1] = ntemp;
				}
			}
		}
		for(int i = 0;i<num;i++) {
			System.out.println(name[i] + " " + score[i]);
		}
		
	}
}
