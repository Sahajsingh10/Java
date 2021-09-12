
/**
   This program demonstrates how numeric types and operators behave in Java
   Do Task #1 before adding Task#2 where indicated.
*/
import java.util.Scanner;

public class NumericTypes {
	public static void main(String[] args) {
		// scanner class for inputs
		Scanner input = new Scanner(System.in);
		// TASK #2 Create a Scanner object here
		// identifier declarations
		int Number = 2;

		double score1;
		double score2;
		int BOILING_IN_F; // boiling temperature
		int fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		System.out.println("Enter Score1: ");
		//inputs score1
		score1 = input.nextDouble();
		System.out.println("Enter Score2: ");
		//inputs score2
		score2 = input.nextDouble();
//convert average of score1 and score2
		average = (score1 + score2) / (Number);
		output = score1 + " and " + score2 + " have an average of " + average;
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		System.out.println("Enter temperature in F: ");
		BOILING_IN_F = input.nextInt();
		input.close();
		fToC = (int) ((0.55555556) * (BOILING_IN_F - 32));
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		// Task #2 prompt user to input another temperature
		// Task #2 read the user’s temperature in Fahrenheit
		// Task #2 convert the user’s temperature to Celsius
		// Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended
	}
}