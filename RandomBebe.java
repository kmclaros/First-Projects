package week5;


	import java.lang.Math;
	import java.util.Scanner;
	public class RandomBebe {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String guess = "";
			String again = "";
			int tries = 0;
			boolean valid = false;
			boolean valid2 = false;
			boolean anotherGamer = false;
			
			do {
			    tries = 0; //Resetting previous value
			    int randomNum = (int)(Math.random() * (100 - 1 + 1) ) + 1;
			    System.out.print("\nThe randomNum is: " + randomNum);
			    System.out.print("\nThis program is a guessing game."
	    				+ "\nThe computer will generate a random integer between 1 and 100. \nThe user will try to guess the number."
	    				+ "\nLet's get started!");
	    		
	    		do {
	    		    System.out.print("\n\nI'm thinkin of a number between 1 and 100.");
	        		System.out.println("\nWhat is your guess?");
	    		    guess = in.nextLine();
	    		    
	    		    try {
	    		        //Cleaning screen
	        			System.out.print("\033[H\033[2J");
	        			System.out.flush();
	        			
	    		        int guessInt = Integer.parseInt(guess);
	            		
	            		if (guessInt == randomNum) {
	            			valid = true;
	            			System.out.print("\nCORRECT! You guessed in " + tries + " tries!!\n");
	            		} else if (guessInt > randomNum) {
	            			tries++;
	            		    valid = false;
	            			System.out.println ("\nYour guess is too high. Try again.");
	            		} else  {
	            			tries++;
	            		    valid = false;
	            			System.out.println("\nYour guess is too low. Try again.");
	            		}
	        		} catch (Exception e) {
	        			tries++;
	            		valid = false;
	        			System.out.println("\nInvalid input, please make sure to input a whole number");
	        		}	
	    		} while (!valid);
	    		
	    		do {
			        System.out.println("\nPlay again? (y/n)");
	    		    again = in.nextLine();
	    		    
	    		    try {
	    		        //Cleaning screen
	        			System.out.print("\033[H\033[2J");
	        			System.out.flush();
	            		
	            		if (again.equalsIgnoreCase("y")) {
	            			anotherGamer = true;
	            			valid2 = true;
	            		}
	            		else if (again.equalsIgnoreCase("n")) {
	            		    anotherGamer = false;
	            		    valid2 = true;
	            		}
	            		else {
	            			valid2 = false;
	            			System.out.println("\nInvalid input, please make sure to input a whole string");
	            		}
	        		} catch (Exception e) {
	        			valid2 = false;
	        			System.out.println("\nInvalid input, please make sure to input a whole string");
	        		}
	    		} while (!valid2);
	    		
			} while (anotherGamer);
			
			System.out.println("\nThanks for playing!");
			System.out.println("\n\nPress \"ENTER\" to continue...");
	        in.nextLine();
			in.close(); 

		}
	}

