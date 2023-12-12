package week11;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in); //Input Scanner for String
	        String choice;
	        boolean game = false;

	        
  do {	
	  	System.out.println();
		System.out.println("This program will show the name of an apostle based on the order they were called, with the Prophet as #1");
		System.out.println("Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit):");
       	choice = in.nextLine();  
   		if (choice.equals("")) {
				break;
   		}else {
       	switch (choice) {
       	case "1":
       		System.out.println("Russell M. Nelson");
       		break;
     	case "2":
       		System.out.println("Dallin H. Oaks");
       		break;
     	case "3":
       		System.out.println("M. Russell Ballard");
       		break;
     	case "4":
       		System.out.println("Jeffrey R. Holland");
       		break;
     	case "5":
       		System.out.println("Henry B. Eyring");
       		break;
     	case "6":
       		System.out.println("Dieter F. Uchtdorf");
       		break;
     	case "7":
       		System.out.println("David A. Bednar");
       		break;
     	case "8":
       		System.out.println("Quentin L. Cook");
       		break;
     	case "9":
       		System.out.println("D. Todd Christofferson");
       		break;
     	case "10":
       		System.out.println("Neil L. Andersen");
       		break;
     	case "11":
       		System.out.println("Ronald A. Rasband");
       		break;
     	case "12":
       		System.out.println("Gary E. Stevenson");
       		break;
     	case "13":
       		System.out.println("Dale G. Renlund");
       		break;
     	case "14":
       		System.out.println("Gerrit W. Gong");
       		break;
     	case "15":
       		System.out.println("Ulisses Soares");
       		break;	
       	default:
       		System.out.print("That's not a valid choice. Try again.");
       	
    		}
	  
	
   		}
  }while (!game);
	in.close();
	}
	
}

