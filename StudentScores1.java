/*Write a program that uses a Scanner object to read from a file. 
*Be sure that you instantiate the Scanner object inside of a try/catch 
*statement but that the Scanner variable is visible outside of the try/catch scope. 
*Using a while(xxxxxxx.hasNext()) structure, read each row of the file into a String variable. 
*Print the String variable to the console.
*/

package week10;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentScores1 {

	public static void main(String[] args) {
		try {
			File myObj = new File ("Student Assignment Scores.csv");
			Scanner StudentScore = new Scanner (myObj);
			while (StudentScore.hasNextLine()) {
				String data = StudentScore.nextLine();
				System.out.println("\n"+ data);
			}
			StudentScore.close();
		} catch (FileNotFoundException e) {
			System.out.println ("An error ocurred.");
			e.printStackTrace();
		
		}
	   
	}

}
