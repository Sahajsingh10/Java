import java.util.Scanner;

public class Reboot {

	public static void main(String[] args) {
		Scanner var1 = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WIFI Diagnosis might work.\n");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		String var2 = var1.nextLine();
		if (var2.equals("yes")) {
			System.out.println("Rebooting your computer seemed to work");
		} else {
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			String var3 = var1.nextLine();
			if (var3.equals("yes")) {
				System.out.println("Rebooting your computer seemed to work");
			} else {
				System.out.println(
						"Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				String var4 = var1.nextLine();
				
				if (var4.equals("yes")) {
					System.out.println("Rebooting your computer seemed to work");
				} else {
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					String var5 = var1.nextLine();
					
					if (var5.equals("yes")) {
						System.out.println("Rebooting your computer seemed to work");
					} else {
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");
					
				}
				
				
			}
			
		}

	}

}
}
