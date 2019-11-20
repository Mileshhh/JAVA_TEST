package homework.test07;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.print("Enter an integer m: ");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int m_copy = m;
		int i = 2, num = 0, n = 1;
		while(m_copy > 1) {
			if(m_copy % i == 0) {
				array.add(i);
				m_copy /= i;
				num++;
			}else {
				if(num % 2 == 1) {
					n *= i;
				}
				num = 0;
				i++;
			}
		}
		if(num % 2 == 1) {
			n *= i;
		}

		System.out.println("The smallest number n for m * n to a perfect square is " + n);
		System.out.print("m * n is " + n * m);
	}
}
