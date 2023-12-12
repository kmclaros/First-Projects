package week8;
import java.util.*;

public class ArrayListSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> numList = new ArrayList <Integer>();
		
		int num= 0, sumT= 0;
		String numS="";
	    boolean valid= false, playAgain = false, next = false;
	    
	do {
		System.out.println("This program will ask the user to enter a series of numbers.\n"
	+"The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\r\n"
	+ "The program will then display the array of numbers and the sum total of those numbers.");
				
			do{
				do{
					System.out.println("\nPlease enter a number (or just hit enter to finish): ");
	
					numS= in.nextLine();
					if(numS.equals(""))
					{
					next = false;    
					}
					else {
						next = true;
					
					try {
					num = Integer.parseInt(numS);
						valid = true;
						numList.add(num);

					} catch (Exception e){
					System.out.println("Invalid response. Please enter a whole number.");
							}
					}
					}while (!valid);
				
			}while (next);
			
			System.out.println("Index\t Item");
			for(int i = 0; i < numList.size(); i++){
			System.out.println(i + "\t " + numList.get(i));
			}
					
			System.out.println ("\nThere are "+ numList.size() + " items in the ArrayList.");

 
			 sumT = sumValues(numList);
			 System.out.println ("\nThe sum total of numbers in the ArrayList is " + sumT);
		
		 playAgain = getValidYN(in, "Would you like to play again? (Y/N): ","Invalid Response! Please answer with a 'Y' or 'N'");
} while (playAgain);
	
	 System.out.println("Goodbye!");
	 in.close();

	}
	public static int sumValues(ArrayList <Integer> sumF) {
		int sum = 0;
		for (Integer i : sumF) {
			sum = sum + i;
				
	}
		return sum;
		
	}
	
	public static boolean getValidYN(Scanner in, String question, String warning) {
		String again;
		boolean valid = false, playagain= false;
							
		do {
	        System.out.println("\n\n" + question);
		    again = in.nextLine();
		    
		    try {
	    		if (again.equalsIgnoreCase("y")) {
	    			valid = true;
	    			playagain=true;
	    		}
	    		else if (again.equalsIgnoreCase("n")) {
	    		    valid = true;
	    		    playagain= false;
	    		    
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
		
		return playagain;
	}

}

			
			