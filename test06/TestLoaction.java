package homework.test06;

import java.util.Scanner;

//9.13(Œª÷√¿‡Location)
public class TestLoaction {
	public static void main(String[] args) {
		int col,row;
		System.out.print("Enter the number of rows and columns in the array:");
		Scanner input = new Scanner(System.in);
		row = input.nextInt();
		col = input.nextInt();
		double[][] array = new double[row][col];
		System.out.println("Enter the array:");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		Location l = locateLargest(array);
		System.out.printf("The location of the largest element is %f at (%d, %d)",l.getMaxValue(),l.getRow(),l.getCol());
	}
	
	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j] > l.getMaxValue()) {
					l.setMaxValue(a[i][j]);
					l.setRow(i);
					l.setCol(j);
				}
			}
		}
		return l;
	}
}
