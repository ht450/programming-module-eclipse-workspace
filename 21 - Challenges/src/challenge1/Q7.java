package challenge1;

import java.util.ArrayList;
import java.util.Collections;

public class Q7 {

	public static void main(String[] args) {
		
		String myScores = "56 78 98 56 87 62";

		// TODO : tokenise the string into an array of string with each element holding an individual score
		String[] scoreArray = myScores.split(" ");
		
		// TODO : store in an arraylist of Integers
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		for (String score : scoreArray) {
			scoreList.add(Integer.parseInt(score));
		}

		// TODO : output in ascending order
		Collections.sort(scoreList);
		System.out.println(scoreList.toString());
		
		// TODO : output the average to 1 decimal place
		Integer total=0;
		for (Integer number : scoreList) {
			total+=number;
		}
		Integer average = total/scoreList.size();
		System.out.println("average = "+average);
		
	}
}
