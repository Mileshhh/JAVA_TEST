package homework.test02;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a year:");
		int Year=input.nextInt();
		boolean isLeapYear=(Year%4==0&&Year%100!=0)||(Year%400==0);
		System.out.println(Year+" is a leap year? "+isLeapYear);
	}
}
