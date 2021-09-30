package lab3;
import java.util.Random;
import java.util.Scanner;

public class randomnumber extends RNG {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		int nextGuess = 0;
		int highGuess = 100;
		int lowGuess = 0;
		int count = 0;
		String ans = "y";
		
		while(ans.equals("y")) {
		int randNum = RNG.rand();
		System.out.println(randNum);
		
	
		System.out.println("enter your first guess? ");
		nextGuess = input.nextInt();
		count++;
		System.out.println("number of guesses is " + count);
		while(nextGuess != randNum) {
		
		if ( nextGuess >= randNum) {
			highGuess = nextGuess;
			System.out.println("your guess is too high");
			System.out.println("Enter your next guess between " + lowGuess + "and " + highGuess);
			nextGuess = input.nextInt();
			count++;
			System.out.println("number of guesses is " + count);
			
			while (nextGuess > highGuess || nextGuess < lowGuess) {
				System.out.println("   >>> Guess must be between "+lowGuess+" and "+highGuess+
						   ".  Try again");
				nextGuess = input.nextInt();
				count++;
				System.out.println("number of guesses is " + count);
			}
			
			continue;
		}
		else if (nextGuess <= randNum) {
			lowGuess = nextGuess;
			System.out.println("your guess is too low");
			System.out.println("Enter your next guess between " + lowGuess + "and " + highGuess);
			nextGuess = input.nextInt();
			count++;
			System.out.println("number of guesses is " + count);
			while (nextGuess > highGuess || nextGuess < lowGuess) {
				System.out.println("   >>> Guess must be between "+lowGuess+" and "+highGuess+
						   ".  Try again");
				nextGuess = input.nextInt();
				count++;
				System.out.println("number of guesses is " + count);
			}
			
			continue;
		}
		
		
		}
		
	System.out.println("Congratulations you guessed correctly");
	System.out.println("Do you want to play again? y/n");
	
	
	
	 ans = s.nextLine();
	
	 
	 if (ans.equals("n")) {
		 break;
	 }
	 
	
	 } 
		
		
		
		System.out.println("Thanks for playing...");
		
		
		
		
		
		
		
		
		

}
}
