package lambda;

import java.util.Random;

public class WorkIt {

	public static void main(String[] args) {

		MyFunction myFunction = () -> System.out.println("Working!");
		myFunction.apply();

		MyFunctionParameters myFunctionParameters = (text) -> System.out.println("Still working " + text);
		myFunctionParameters.printMessage("Hugh");

		MyFunctionWithReturn myFunctionWithReturn = (num1, num2) -> num1 + num2;
		System.out.println(myFunctionWithReturn.manipulateNumbers(3, 4));

		MyFunctionWithReturn subtractNumbers = (num1, num2) -> num1 - num2;
		System.out.println(subtractNumbers.manipulateNumbers(5, 1));

		// exercises from the slides
		
		NumberCruncher divByTen = (num) -> num/10;
		System.out.println(divByTen.myVal(20.0));
		
		NumberCruncher divByTwo = (num) -> num/2;
		System.out.println(divByTwo.myVal(20.0));
		
		
		AnInterface numberGen = (upperLimit) -> {
			Random random = new Random();
			int randomNumber = random.nextInt(upperLimit);
			// add one - for fun
			randomNumber++;
			System.out.println("Got a number...");
			return randomNumber;			
		}; // end of lambda block expression
		
		System.out.println(numberGen.numberGen(100));
		
		
	}

}
