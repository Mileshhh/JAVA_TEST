package homework.test06;

import java.util.Scanner;

//9.12(几何：交点)
public class TestLinearEquation {
	public static void main(String[] args) {
		double x1, x2, x3, x4, y1, y2, y3, y4;
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
		Scanner input = new Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = a * x1 + b * y1;
		double f = c * x3 + d * y3;

		LinearEquation l = new LinearEquation(a, b, c, d, e, f);
		
		if(l.isSovable()) System.out.print("The intersecting point is at (" + l.getX() + ", " + l.getY() + ")");
		else System.out.print("The two lines are parallel");
	}
}
