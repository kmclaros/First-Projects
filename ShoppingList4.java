package week12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingList4 {
public static void main(String[] args) {

	Scanner sIn = new Scanner(System.in); // Input Scanner for String
	ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
	String choice; // Holds user input of type String
	boolean done = false; // Keeps program running until user wants to quit
	// Keep running the program until the user quits
	do {
	// Print out the menu to the console
	System.out.println();
	System.out.println("1. Add Items");
	System.out.println("2. Delete Items");
	System.out.println("3. Show Items");
	System.out.println("4. Sort Items");
	System.out.println("5. Save List");
	System.out.println("6. Open List");
	System.out.println("7. Exit");
	System.out.print("Please enter a command: ");
	choice = sIn.nextLine();
	// Call the appropriate method for the choice selected.
	switch (choice) {
	case "1": // Add items to the Shopping List
	System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
	break;
	case "2": // Delete items from the Shopping List
	System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
	break;
	case "3": // Show the items in the Shopping List
	showItems(shoppingList);
	break;
	case "4": // Sort the items in the Shopping List
	sortItems(shoppingList);
	break;
	case "5": // Save the list
	String fileName = "Shopping List.txt";
	saveList(sIn, shoppingList, fileName);
	break;
	case "6":
	// call openList function and receive the shoppingList 
	shoppingList = openList(sIn, shoppingList, "Shopping List.txt");
	break;
	case "7": // Exit the program
	System.out.println();
	System.out.println("Goodbye");
	done = true;
	break;
	default: // Handles all input that is not between 1-6
	System.out.println("Invalid response.  Please enter a choice from the menu (1-7).");
	} // End of switch (choice)
	} while (!done); // Keep running the program until the user quits
	sIn.close();
    }// end of main()

public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
	int count = 0;
	while (true) {
	System.out.print("Add an item to the list (or just hit 'ENTER' when done): ");
	String enteredValue = sIn.nextLine();
	if (enteredValue.trim().isEmpty()) {
	break;
	}
	if (!enteredValue.contains(":")) {
	System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");
	continue;
	}
	int colonIndex = enteredValue.indexOf(":"); // gets the index number for where the ":" is located
	String item = enteredValue.substring(0, colonIndex).trim(); // gets everything before the colon
	String amount = enteredValue.substring(colonIndex + 1).trim(); // gets everything after the colon
	String validString = item + ":" + amount;
	shoppingList.add(validString);
	System.out.println(validString + " has been added to the Shopping List.");
	count++;
	}
	return count;
    }//end addItems
    // end of method addItems(ArrayList<String>)

public static String deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
	String itemToDelete;
	int count = 0; // count of items that have been deleted
	do {
	System.out.print("Delete an item from the list (or just hit 'ENTER' when done): ");
	itemToDelete = sIn.nextLine();
	if (itemToDelete.length() > 0 && !shoppingList.contains(itemToDelete)) {
	System.out.println("Invalid Response! " + itemToDelete + " is NOT an item in the list.");
	showItems(shoppingList);
	} else if (itemToDelete.length() > 0 && shoppingList.contains(itemToDelete)) {
	System.out.println(itemToDelete + " has been deleted from the Shopping List.");
	shoppingList.remove(itemToDelete);
	count++;
	}
	} while (itemToDelete.length() > 0);
	return "" + count;
    }// end of method deleteItems(ArrayList<String>)

public static void showItems(ArrayList<String> shoppingList) {
	if (shoppingList.size() == 0) {
	System.out.println("Shopping list is empty!!");
	return;
	}
	System.out.println("\n---------------------------\n        Shopping List\n---------------------------");
	for (Object shop : shoppingList) {
	String value = (String) shop;
	int colonIndex = value.indexOf(":"); // gets the index number for where the ":" is located
	String item = value.substring(0, colonIndex).trim(); // gets everything before the colon
	String amount = value.substring(colonIndex + 1).trim(); // gets everything after the colon
	System.out.printf("%-20s\t%-20s\n", item, amount);
	}
    }// end of method showItems(ArrayList<String>)

public static void sortItems(ArrayList<String> shoppingList) {
	Collections.sort(shoppingList);
	System.out.print("The Shopping List has been sorted.");
	showItems(shoppingList);
    }// end of method sortItems(ArrayList<String>)

public static void saveList(Scanner sIn, ArrayList<String> shoppingList, String fileName) {
	//Ask user if he/she wants to overwrite the file
	System.out.print("Are you sure you wish to overwrite the 'Shopping List.txt' file with your current list? (Y/N)");
	String userChoice = sIn.nextLine();
	//if user is okay to overwrite the file, save the file
	if (userChoice.equalsIgnoreCase("y")) {
	try {
	//  FileWriter will write date to the file
	FileWriter output = new FileWriter(fileName);
	//loop through the shopping list and write one item per line
	for (int index = 0; index < shoppingList.size(); index++) {
	// Writes the item to the file
	output.write(shoppingList.get(index));
	//if not last item, add a new line
	if (index != shoppingList.size() - 1) {
	output.write("\n");
	}
	}
	// Closes the writer
	output.close();
	} catch (IOException e) {
	//If some failure happened while writing to the file, display message that shopping list is not saved
	System.out.println("Shopping List not saved.");
	}
	//If everything went fine, display message that shopping list has been saved
	System.out.println("Shopping List saved to file: " + fileName + ".");
	} else { //if user is NOT okay to overwrite the file, do not save the file and display message
	System.out.println("Shopping List not saved.");
	}
    }// end of method saveList
 
public static ArrayList<String> openList(Scanner scn, ArrayList<String> shoppingList, String FILENAME) {
	String userChoice = "";
	boolean done = false;
	// create another shoppingList to hold the items of file
	ArrayList<String> shoppingList2 = new ArrayList<>();
	// Keep running the loop until the user provide correct choice that is either (Y/N)
	while (!done) {
	// ask the user if they are sure they want to overwrite the current shopping list being edited with the file on the fixed storage device
	System.out.print("Are you sure you wish to overwrite your current shopping list with the 'Shopping List.txt' file? (Y/N)");
	// take the choice
	userChoice = scn.nextLine();
	// if choice is y or Y
	if (userChoice.equalsIgnoreCase("y") && shoppingList.size()==0) { // changes by LJ
		
		System.out.println("File Error: File 'Shopping List.txt' not found! Please save the list before trying to open it.");
		done = true;
	}
	
	else if (userChoice.equalsIgnoreCase("y") && shoppingList.size()!=0) { //changes by LJ 
	// open the file in try-catch statement to determine if the Open was successful and display's a confirmation message.
	try {
	// open the given file to read items
	Scanner input = new Scanner(new File(FILENAME));
	// run a while loop to read each lines from given file and add them in shoppingList2
	while (input.hasNextLine()) {
	shoppingList2.add(input.nextLine());
	}
	// assign shoppingList2 in shoppingList
	shoppingList = shoppingList2;
	// display confirmation message
	System.out.println("Shopping List overwritten from file: " + FILENAME + ".");
	// Closes the input file
	input.close();
	// mark done as true to break the while loop
	done = true;
	} catch (IOException e) {
	// To determine if the Open was failed and display an error message.
	System.out.println("File Error: File \'" + FILENAME + "\' not found! Please save the list before trying to open it.");
	// mark done as true to break the while loop
	done = true;
	}
	} // if choice is n or N
	else if (userChoice.equalsIgnoreCase("n")) {
	System.out.println("Shopping List not opened.");
	// mark done as true to break the while loop
	done = true;
	} // if choice is invalid
	else {
	System.out.println("Invalid response. Please answer with a 'Y' or 'N'");
	// continue the while loop to get valid response from user
	continue;
	}
	}
	// return the shopping list 
	return shoppingList;
    }
}