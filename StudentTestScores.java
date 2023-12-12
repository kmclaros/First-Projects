package week10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

  public class StudentTestScores {
  public static void main(String[] args) throws FileNotFoundException {
	String fileName = "Student Test Grades.csv";
	Scanner file = new Scanner(new File(fileName));
    ArrayList<String[]> classRoster = new ArrayList<String[]>();
	while (file.hasNext()) {
	String line = file.nextLine();            // Read data line by line
	String[] splitOnComma = line.split(",");  // Split line on the basis of comma(,)
	classRoster.add(splitOnComma); 	          // Add into classRoster
	}
	file.close();

    String[][] numericIntoLetter = { { "94", "A" }, { "90", "A-" }, { "87", "B+" }, { "84", "B" }, { "80", "B-" },
		{ "77", "C+" }, { "74", "C" }, { "70", "C-" }, { "67", "D+" }, { "64", "D" }, { "60", "D-" } };
	System.out.println("------------------------------------------------------");
	String[] header = classRoster.get(0);
	System.out.printf("%s\t\t\t      %s  %s   %s\n", header[0], header[1], header[2], header[3]);
	System.out.println("------------------------------------------------------");

	for (int i = 1; i < classRoster.size(); i++) {
	String[] student = classRoster.get(i);                // Take one by one Student info
	int test1 = Integer.parseInt(student[1]);             // Convert String into numeric
	int test2 = Integer.parseInt(student[2]);
	int test3 = Integer.parseInt(student[3]);

	String grade1 = "", grade2 = "", grade3 = "";         // These will hold grades
	for (int j = 0; j < numericIntoLetter.length; j++) {  // For loop, to work on 2-dimensional array
	int val = Integer.parseInt(numericIntoLetter[j][0]);  // Get number to the 2-dimensional array
	if (test1 > val && grade1.isEmpty())
	grade1 = numericIntoLetter[j][1];
	if (test2 > val && grade2.isEmpty())
	grade2 = numericIntoLetter[j][1];
	if (test3 > val && grade3.isEmpty())
	grade3 = numericIntoLetter[j][1];
	} 
	if (grade1.isEmpty())  // If test1 is less than 60 execute if block and assign "E"
	grade1 = "E";
	if (grade2.isEmpty())  // If test2 is less than 60 execute if block and assign "E"
	grade2 = "E";
	if (grade3.isEmpty())  // If test3 is less than 60 execute if block and assign "E"
	grade3 = "E";
	System.out.println(student[0] + "\t\t\t" + grade1 + "\t" + grade2 + "\t" + grade3);
	} 
	}
}

