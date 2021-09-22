import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		String ans2;
		Movie c = new Movie();
		int count = 0;
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Do you want to enter (y or n)");

			ans2 = input.nextLine();
			if (ans2.equals("n")) {
				break;
			}
			if (count != 0) {
				ans2 = input.nextLine();
				if (ans2.equals("n")) {
					break;
				}
			}

			System.out.println("enter the title of a  movie");

			String movie = input.nextLine();

			c.setTitle(movie);

			System.out.println("enter the rating of the movie ");

			String rate = input.nextLine();

			c.setRating(rate);

			System.out.println("enter the number of tickets sold");

			int number = input.nextInt();

			c.setSoldTickets(number);

			System.out.println(c.toString());
			count++;

		} while (ans2 != "n");

		System.out.println("Goodbye");

	}
}
