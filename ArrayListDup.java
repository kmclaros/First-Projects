package week8;
import java.util.*;

  public class ArrayListDup {
	  	
		
  public static <T> ArrayList<T> dups(ArrayList<T> list) {
	
	ArrayList<T> newList = new ArrayList<T>();
	ArrayList<T> nL = new ArrayList<T>();
	for (T element : list) {
	if (!newList.contains(element)) {
	newList.add(element);
	}
	else{
	if (!nL.contains(element)) {
	nL.add(element);
	}
	}
	}
	return nL;
	
	}
  
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	boolean repeatRun= false;
	do {
	ArrayList<Integer> list = new ArrayList<Integer>();
	System.out.println("\nThis program will ask the user to enter a series of numbers.\n"
			+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\nThe program will then display the array of numbers and the sum total of those numbers.\n");
	while(true)
	{
		
	System.out.print("\nPlease enter a number (or just hit enter to finish): ");
	String s = in.nextLine( );
	if(s.equals(""))
	{
	break;    
	}
	else
	{
	list.add(Integer.parseInt(s));
	}
	}
	ArrayList<Integer> nL = dups(list);
	System.out.println("\nIndex Item: ");
	int Sum = 0;
	for(int i = 0; i < list.size(); i++){
	System.out.println(i + "\t " + list.get(i));
	Sum += list.get(i);
	
	}
	System.out.println("\nThere are " + list.size() + " items in the ArrayList.");
	System.out.println("\nThe sum total of numbers in the ArrayList is " + Sum);
	System.out.println("\nThe following numbers were duplicated in the ArrayList: " + nL);
	
	boolean valid;
	do {
        System.out.println("\n\nDo you wish to play again? (Y/N)");
	    String again = in.nextLine();
	    
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

System.out.println("\n\nThank you for using our program.");
in.nextLine();

	 in.close();

	}
	 
  	}
  
