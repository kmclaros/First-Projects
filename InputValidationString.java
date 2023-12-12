package week5;
import java.util.Scanner;

public class InputValidationString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		boolean response =false;
				
		do {
			System.out.print("Do you like to code in Java?:\n");
			input = in.nextLine();
			if (input.equalsIgnoreCase("y")) {
				System.out.println ("\nThat's great! I do too!\n");
				response = true;
			} else if (input.equalsIgnoreCase("n")) {
				System.out.print("\nThat's ok. There are many other wonderful things in life to learn.\n");
			response = true;
			}  else {
				System.out.print("Invalid Response! Please answer with a 'Y' or 'N'.\n\n");
			}
				
	}while (!response);
		
		in.close();
	}
}
