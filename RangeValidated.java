package week6;

import java.util.Scanner;

public class RangeValidated {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String again = "";
		boolean repeatRun = false;
		boolean valid = false; 
		int n1 = 1, n2 = 1, n3 = 1; 
		
		do {
		System.out.print("This program will ask the user for three numbers:\r\n"
				+ "    * A starting number\r\n"
				+ "    * An ending number\r\n"
				+ "    * A multiplier\r\n"
				+ "The program will multiply each number between the starting number and ending number by the multiplier.");
		
		    try {
		        System.out.print("\n\nPlease enter the starting number: ");
		        n1 = Integer.parseInt(in.nextLine());
		        valid = true;
		    } catch(Exception e) {
		        System.out.println("\nInvalid Response! Please enter a whole number.");
		        valid = false;
		    }
		} while(!valid);
		do {
		    try {
		        System.out.print("Please enter the ending number: ");
		        n2 = Integer.parseInt(in.nextLine());
		        valid = true;
		    } catch(Exception e) {
		        System.out.println("\nInvalid Response! Please enter a whole number.");
		        valid = false;
		    }
		} while(!valid);
		do {
		    try {
		        System.out.print("Please enter the multiplier: ");
		        n3 = Integer.parseInt(in.nextLine());
		        valid = true;
		    } catch(Exception e) {
		        System.out.println("\nInvalid Response! Please enter a whole number.");
		        valid = false;
		    }
		} while(!valid);
		
		System.out.println("");
	    System.out.println("Here are the numbers between " + n1 + " and " + n2 + " thatare divisible by " + n3);

	    for (int i = n1; i <= n2; i++) {
		    System.out.println("Multiplying " + i + " by " + n3 + " results in: " + (i * n3));
        
		}
		do {
        System.out.println("\n\nWould you like to play again? (Y/N)");
	    again = in.nextLine();
	    
	    try {
    		if (again.equalsIgnoreCase("y")) {
    			repeatRun = true;
    			valid = true;
    		}
    		else if (again.equalsIgnoreCase("n")) {
    		    repeatRun = false;
    		    valid = true;
    		}
    		else {
    			valid = false;
    			System.out.println("\nInvalid input, please make sure to input a whole string");
    		}
		} catch (Exception e) {
			valid = false;
			System.out.println("\nInvalid input, please make sure to input a whole string");
		}
	} while (!valid);
		
 while (repeatRun);
System.out.print("\n\nThank you for running the program! Have a great day!");
in.nextLine();
in.close(); 
}
}
