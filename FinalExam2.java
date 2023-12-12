/*
 * Program: Final Exam 2
 * Name: Karla Cortez Claros
 * Date: 2/4/2022
 * Description: Arrays and Functions
 */
package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		ArrayList <Integer> numList = new ArrayList <Integer>();
		Scanner in = new Scanner(System.in);
		String numS;
		int num = 0; 
		boolean next = false;
		do {
		System.out.print("\n\nIn this program, you will ask the user to enter a list of numbers.\n"
				+ "The program will then find the sum of the numbers and determine which of the numbers is the largest.\n\n");
			
		do{
			System.out.print("Please enter a number (or just hit enter to finish): ");
			numS= in.nextLine();
	        next = numS.equals("") ? false : true; // Validates if the user hits enter to exit list
	        if (next) {
	        	num = Integer.parseInt(numS);
	 	        numList.add(num);
	        }
		}while (next);
							
		System.out.printf("\nThe sum of the list of numbers is: %d", addNumbers (numList));
		System.out.printf("\nThe largest number in the list is: %d", largestNumber (numList));
		
		} while (newList(in));
		
		System.out.print("\nGoodbye!");
		
		in.close();
		
	}//end of main()

	public static int addNumbers(ArrayList <Integer> sumList) {
		int sum = 0;
		for (Integer i : sumList) {
			sum = sum + i;
		}
		return sum;	
	} //end of addNumbers
	
	public static int largestNumber(ArrayList <Integer> largestList) {
		int largest = 0;
		for (int i = 0; i < largestList.size(); i++) {
			if(largestList.get(i) > largest) {
				largest = largestList.get(i);
			}
		}			
		return largest;	
	}	// end of largestNumber
	
	public static boolean newList (Scanner in) { //Will ask the user if they want to create a new list
		String again;
		boolean valid = false, newL= false;// newL is a flag variable indicating if the program will continue or if it should stop
							
		do {
	        System.out.println("\n\nWould you like to create a new list? (Y/N) ");
		    again = in.nextLine();
		    
		    try {
	    		if (again.equalsIgnoreCase("y")) {
	    			valid = true;
	    			newL=true;
	    		}
	    		else if (again.equalsIgnoreCase("n")) {
	    		    valid = true;
	    		    newL= false;
	    		    
	    		}
	    		else {
	    			valid = false;
	    			System.out.print("Invalid response. Please enter Y or N to continue.");
	    		}
			} catch (Exception e) {
				valid = false;
				System.out.print("Invalid response. Please enter Y or N to continue.");
			}
		} while (!valid);
		
		return newL;
	}// end of newList
}//end of class FinalExam2
