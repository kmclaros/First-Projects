package week10;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5;

		if (x > 5) {
		  System.out.println("Greater than 5!");
		  if (x == 5) {
		    System.out.println("Found 5!");
		  }
		} else if (x <= 5) { 
		  System.out.println("Might be 5!");
		  switch(x) {
		    case 5:
		      System.out.println("Found 5");
		      break;
		    case 4:
		      System.out.println("Found 4!");
		      break;
		    case 3: 
		      System.out.println("Found 3!");
		      break;
		    default:
		      System.out.println("Not 5, 4, or 3...");
		} }
		else {
		  System.out.println("Not a valid number");
		} 
	}


}
