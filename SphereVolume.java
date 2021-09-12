import java.util.Scanner;

public class SphereVolume {
	public static void main(String[] args) {
		double diameter;
		double radius;
		double volume;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a dimeter of a sphere: ");
		diameter = input.nextDouble();
		radius = diameter / 2;
		input.close();
		volume = (1.33333333) * (Math.PI) * Math.pow(radius, 3);
		
		System.out.println("The volume is: " + volume);
		
		

	}

}
