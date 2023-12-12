package week7;
import java.util.Scanner;

public class GetValidX {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {
		// Get an integer from the user
		int intNum = getValidInt(in, "Please enter a whole number: ","Invalid Response! Please enter a whole number.");
		System.out.printf("The whole number your entered was: %d.%n", intNum);
		System.out.println("Now we will test your whole number in a math equation...");
		System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.%n", intNum, intNum + 10);
		System.out.println();
		// Get a floating-point from the user
		double doubleNum = getValidDouble(in, "Please enter a decimal-point number: ","Invalid Response! Please enter a number.");
		System.out.printf("The float your entered was: %f.%n", doubleNum);
		System.out.println("Now we will test your floating-point number in a math equation...");
		System.out.printf("Adding 10 to your float would be: 10 + %f = %f.%n", doubleNum, doubleNum + 10);
		System.out.println();
		// Get a 'Y' or 'N' from the user
		playAgain = getValidYN(in, "Would you like to play again? (Y/N): ","Invalid Response! Please answer with a 'Y' or 'N'");
		System.out.println();
		} // end of while (playAgain.equalsIgnoreCase("y"))
		System.out.println("Goodbye!");
		in.close();
		}// end of Main()
		public static int getValidInt(Scanner in, String question, String warning) {
			String numS;
			int num=0;
			boolean  valid =false;
			
			do {
				System.out.println("\n"+question+" \n");
				numS= in.nextLine();
									
				try {
					num = Integer.parseInt (numS);
					valid=true;
			 } catch(Exception e) {
			        System.out.println("\n"+ warning);
			        valid = false;
			    }
			} while(!valid);
			return num;
		}
		public static double getValidDouble(Scanner in, String question, String warning) {
			String numS;
			double numd=0;
			boolean  valid =false;
			
			do {
				System.out.println("\n"+question+" \n");
				numS= in.nextLine();
									
				try {
					numd = Double.parseDouble (numS);
					valid=true;
			 } catch(Exception e) {
			        System.out.println("\n"+ warning);
			        valid = false;
			    }
			} while(!valid);
			return numd;
						
		}
		
		public static String getValidYN(Scanner in, String question, String warning) {
			String again;
			boolean valid = false;
						
			do {
		        System.out.println("\n\n" + question);
			    again = in.nextLine();
			    
			    try {
		    		if (again.equalsIgnoreCase("y")) {
		    			valid = true;
		    		}
		    		else if (again.equalsIgnoreCase("n")) {
		    		    valid = true;
		    		}
		    		else {
		    			valid = false;
		    			System.out.println("\n" + warning);
		    		}
				} catch (Exception e) {
					valid = false;
					System.out.println("\n"+ warning);
				}
			} while (!valid);
			return again;
			
		}

		
		
}

