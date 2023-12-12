/*
 * Program: Final Exam 1
 * Name: Karla Cortez Claros
 * Date: 2/4/2022
 * Description: Strings
 */
package Final;
 
import java.util.Scanner;
 
class FinalExam1 {
	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name, ward, adultMales, adultFemales;
		int adultM=0, adultF=0, adultsTotal =0;
		boolean valid = false;
		
		System.out.print ("Please enter your name: "); 
	    name = in.nextLine();
		System.out.print ("\nPlease enter the name of your Ward: ");
	    ward = in.nextLine();
	
		do {
			System.out.print ("\nPlease enter the approximate number of adult males in the ward: ");
	        adultMales = in.nextLine();
	        try {
	        	adultM = Integer.parseInt(adultMales);
	        	valid=adultM<0 ? false : true; // Validates if the value is less than zero
	        	if (!valid) {
	        		System.out.print("Invalid Response. Please enter a positive whole number.\n");
	        	}
		    } catch (Exception e) {
		    	System.out.print("Invalid Response. Please enter a whole number.\n");
		    	valid=false;
		    }
		} while (!valid);
		
		valid = false; // Resets "valid" variable
		
		do {
			System.out.print ("\nPlease enter the approximate number of adult females in the ward: ");
	        adultFemales = in.nextLine();
		    try {
		    	adultF = Integer.parseInt(adultFemales);
		        valid=adultF<0 ? false : true; // Validates if the value is less than zero
	        	if (!valid) {
	        		System.out.print("Invalid Response. Please enter a positive whole number.\n");	    
	        	}
		    } catch (Exception e) {
		    	System.out.print("Invalid Response. Please enter a whole number.\n");
		    	valid=false;
		    }
		} while (!valid);
		
		adultsTotal = adultM+adultF; // Adding the total of adult males with adult females
		System.out.printf("\nThere are %d adult members in %s's %s ward.", adultsTotal, name, ward);
		in.close();
		
	}//end of main()
	
}//end of class FinalExam1





