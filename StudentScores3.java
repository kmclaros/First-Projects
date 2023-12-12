package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentScores3 {

	public static void main(String[] args) {
		
		try {
			File myObj = new File ("Student Assignment Scores.csv");
			Scanner StudentScore = new Scanner (myObj);
			
			StudentScore.nextLine();	
			System.out.printf("%-30s%7s%n", "Student", "Assignment with 0" );
			System.out.println("-------------------------------------------------");
			
			while (StudentScore.hasNextLine()) {
				String [] data = StudentScore.nextLine().split(",");
				boolean res = Arrays.asList(data).contains("0");
				if (res) {
					for (int i=1; i<=6 ; i++) {
						if (data[i].equals("0")){
						System.out.printf("%-30s%7s%n", data[0], i );

						}
					}
				}
				
			}
			StudentScore.close();
		} catch (FileNotFoundException e) {
			System.out.println ("An error ocurred.");
			e.printStackTrace();
		
		}   
	}
}

