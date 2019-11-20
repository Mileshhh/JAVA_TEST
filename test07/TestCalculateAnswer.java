package homework.test07;

import java.util.Scanner;

public class TestCalculateAnswer {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		CalculateAnswer answers = new CalculateAnswer();
		
		Scanner input = new Scanner(System.in);
		System.out.print("what is " + number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		while(number1 + number2 != answer) {
			if(answers.ifExist(answer)) System.out.println("You already entered " + answer);
			
			answers.addList(answer);
			System.out.print("Wrong answer. Try again. What is "+ number1 + " + " + number2 + "? ");
			answer = input.nextInt();
		}

		System.out.println("You got it!");
	}
}
