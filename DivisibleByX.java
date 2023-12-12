package week6;
import java.util.Scanner;

public class DivisibleByX {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String again = "";
			boolean repeatRun = false;
			boolean valid = false; 
			int n1 = 1, n2 = 1, n3 = 1; 
			do {
	    		do {
	    			System.out.print("In this program, we will display a series of numbers divisible by an integer specified by the user.\n"
+ "You will ask the user for the starting number, the ending number and the integer to be considered.\n");
	    		    try {
	    		        System.out.print("\nPlease enter the starting number: ");
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
	    	         if (i % n3 == 0)
	    	         System.out.printf("\n%d", i );
	    		}
	    		
	    		do {
	    	        System.out.println("\n\nRun again? (Y/N)");
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
			} while (repeatRun);
			System.out.print("\n\nThank you for running the program! Have a great day!");
	        in.nextLine();
			in.close(); 
		}
	

	}


