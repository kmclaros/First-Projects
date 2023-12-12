package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores2 {

	public static void main(String[] args) {
		try {
			File myObj = new File ("Student Assignment Scores.csv");
			Scanner StudentScore = new Scanner (myObj);
			
			StudentScore.nextLine();	
			System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", "Student", "Asn 1", "Asn 2", "Asn 3", "Asn 4", "Asn 5", "Asn 6" );
			System.out.println("-----------------------------------------------------------------------------------");
			
			while (StudentScore.hasNextLine()) {
				String [] data = StudentScore.nextLine().split(",");
				System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", data[0], data[1], data[2], data[3], data[4], data[5], data[6] );
			}
			StudentScore.close();
		} catch (FileNotFoundException e) {
			System.out.println ("An error ocurred.");
			e.printStackTrace();
		
		}
	   
	}

}