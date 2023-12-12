package week6;
import java.util.Scanner;

public class ImprovedInterest {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			float monthlyDeposit = 0, annualInterest = 0;
			int months = 0;
			String again = "" , deposit= "", annualI = "" , monthS = " ";
			boolean repeatRun = false;
			boolean valid = false;
			
			do {

				System.out.println("This program will ask the user for a monthly deposit,");
				System.out.println("an annual interest rate,");
				System.out.println("and the number of months the user plans on saving");
				System.out.println("It will then show the monthly balance over the period of planned savings.");
				System.out.println();
				
				do {
					System.out.print("\nPlease enter the amount to be deposited each month: ");
    		         deposit= in.nextLine();
	    		    try {
	    		        
	    		        monthlyDeposit = Float.parseFloat(deposit);
	    		        valid = true;
	    		    } catch(Exception e) {
	    		        System.out.println("\nInvalid Response! Please enter a number.");
	    		        valid = false;
	    		    }
	    		} while(!valid);

				do {
    		        System.out.print("\nPlease enter the annual interest rate: ");
    		         annualI = in.nextLine();
	    		    try {
	    		        annualInterest = Float.parseFloat(annualI);
	    		        valid = true;
	    		    } catch(Exception e) {
	    		        System.out.println("\nInvalid Response! Please enter a valid number.");
	    		        valid = false;
	    		    }
	    		} while(!valid);

				do {
    		        System.out.print("\nPlease enter the number of months you plan to save: ");
    		        monthS = in.nextLine();
    		        
	    		    try {
	    		        months = Integer.parseInt(monthS);
	    		        valid = true;
	    		    } catch(Exception e) {
	    		        System.out.println("\nInvalid Response! Please enter a whole number.");
	    		        valid = false;
	    		    }
	    		} while(!valid);
				
    		    System.out.println("\nMonth\t\t\tBalance");

				float percentageRate = (1 / 100f);
				float monthlyRate = (1 / 12f);

				float monthlyInterest = (annualInterest * monthlyRate * percentageRate); 
			    float actualMonth = (monthlyDeposit * (1 + monthlyInterest));
				float nextMonth = actualMonth;

				for (int i = 1; i <= months; i++) {
					if (i == 1){

					}else
					nextMonth = ((monthlyDeposit + nextMonth) * (1 + monthlyInterest));
					System.out.printf("Month %d: \t\t $%,.2f \n"  , i, nextMonth);
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
	            			System.out.println("\nInvalid input, please make sure to input Y or N");
	            		}
	        		} catch (Exception e) {
	        			valid = false;
	        			System.out.println("\nInvalid input, please make sure to input Y or N");
	        		}
	    		} while (!valid);
			
			} while (repeatRun);

			System.out.println("\n\nThank you for calculating the monthly balance with our program.");
	        in.nextLine();
			in.close(); 
		
		}

	}

