package week13;
import java.util.*;
import java.io.*;

public class FormLetter {
	
	
	

	public static void main(String[] args) throws IOException {
	
		Scanner fileOne= null;
		
		//Scanner fileTwo= null;
		
		
		
		////////////////////////////////////////////////
		
		File studentScoresFile= new File("Student Assignment Scores.csv"); // accesing the first file
		
		File letterToStudent = new File("Warning Letter to Student -.txt"); //accesing the second file
		//////////////////////////////////////////////////////////////////////////////////////////
		
		//check file existence
		if(!studentScoresFile.exists()&& !letterToStudent.exists()) {
			
			System.out.println("File does not exist!");
			return;
		}
		/////////////////////////////////////////////////////////////////////
		
		ArrayList<String[]>studentScoresArray = new ArrayList<String[]>();
		
		ArrayList<String>letterArray = new ArrayList<String>();
		/////////////////////////////////////////////////////////////////
		//Scan the files
		
		try {
			fileOne= new Scanner(studentScoresFile);
			
			//storing file one inside an array line by line

			while (fileOne.hasNext()) {

				String saveFile1 = fileOne.nextLine();

				String[] fileOneArray= saveFile1.split(",");

				studentScoresArray.add(fileOneArray); 



			}
		
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		printZeroScores (studentScoresArray);
		
		fileOne.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
	
	public static void printZeroScores (ArrayList<String[]> studentScoresFile) throws IOException { 
		File finalLetter= new File("Warning Letter to Student -.txt");
	File letterToStudent = null;
	Scanner fileTwo= null;

		for(String[]studentZero : studentScoresFile) {
		
			for (int i =1; i!=studentZero.length; i++) { 
				
				if (studentZero[i].equals("0"))  {
					letterToStudent= new File("Warning Letter To Student - "+ studentZero[0]+".txt");
					
					if (!letterToStudent.exists()) {

						
						try {
							fileTwo = new Scanner(finalLetter); //scan the second file
							
							//storing file two inside one string token (letterBody)
							
							fileTwo.useDelimiter("\\z"); //using the scanner method delimiter to analize split the scanner
							
							
							String letterBody= " ";	
					   
							while(fileTwo.hasNext()) {
						   
						   letterBody = fileTwo.next();
						   						 
							letterToStudent.createNewFile();
							FileWriter letterWritter = new FileWriter(letterToStudent);  
							letterWritter.write("Dear " + studentZero[0] + "\n" + letterBody + "\n" + "Assigment " + i);
							letterWritter.flush();
							letterWritter.close();
						  break;
					   }
					
							
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
					else {
						String previousLetter = "";
						Scanner input = new Scanner(letterToStudent);
						while (input.hasNextLine()) {
							previousLetter+=input.nextLine()+"\n";
						}
						input.close();
						
						FileWriter letterWritter = new FileWriter(letterToStudent);
						letterWritter.write(previousLetter + "\n" + "Assigment " + i);
						letterWritter.flush();
						letterWritter.close();

					}
			
					System.out.printf("%-30s Assigment %d%n", studentZero[0], i); 
					
					//if (studentZero[0])
			
				} 

			}

	} 
	
		fileTwo.close();
} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

