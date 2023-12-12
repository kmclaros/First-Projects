package week7;
import java.util.Scanner;

public class IsBetween {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int a=0, b=0, c=0;
			String num1= "", num2= "", num3="", again = "" ;
			boolean valid = false, repeatRun=false; 
		do {
			System.out.println("This program will ask the user for three numbers and determine \nif the second number lies between the first and the third.");

		
			do {
			System.out.println("\nPlease enter the low number: \n");
			num1= in.nextLine();
					
			try {
				a = Integer.parseInt (num1);
				valid=true;
		 } catch(Exception e) {
		        System.out.println("\nInvalid Response! Please enter a whole number:");
		        valid = false;
		    }
		} while(!valid);

		System.out.println("\nPlease enter the number to be tested (the between number): \n");
		num2= in.nextLine();
				
		try {
			b = Integer.parseInt (num2);
			valid=true;
	 } catch(Exception e) {
	        System.out.println("\nInvalid Response! Please enter a whole number.");
	        valid = false;
	    
	} while(!valid);
	System.out.println("\nPlease enter the high number: \n");
	num3= in.nextLine();
			
	try {
		c = Integer.parseInt (num3);
		valid=true;
	} catch(Exception e) {
	    System.out.println("\nInvalid Response! Please enter a whole number.");
	    valid = false;

	} while(!valid);

		if (isBetween(a,b,c)) {
		System.out.println(b + " lies between the numbers " + a +" and " + c);
		
		}else
			System.out.println(b + " DOES NOT lie between the numbers " + a +" and " + c);
			
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
	    			System.out.println("\nInvalid input, please make sure to input Y or N");
	    		}
			} catch (Exception e) {
				valid = false;
				System.out.println("\nInvalid input, please make sure to input Y or N");
			}
		} while (!valid);

	 
		}while (repeatRun);

	System.out.println("\n\nThank you for calculating the largest number with our program.");
	in.nextLine();

			in.close();
		
		}
		
		public static boolean isBetween(int n1, int n2,int n3) {
			boolean result=false;
			if (n2>n1 && n2<n3) 
				result= true;
			return result;
		}		
		}

	



		




