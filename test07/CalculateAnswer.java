package homework.test07;

import java.util.ArrayList;

public class CalculateAnswer {
	ArrayList<Integer> answers = new ArrayList<Integer>();
	
	void addList(int newAnswer) {
		answers.add(newAnswer);
	}
	
	boolean ifExist(int newAnswer) {
		if(answers.indexOf(newAnswer) >= 0) return true;
		return false;
	}
}
