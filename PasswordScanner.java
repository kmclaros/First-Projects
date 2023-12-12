package week13;
import java.util.Scanner;
import java.io.*;

public class PasswordScanner {

	public static void main(String[] args) throws IOException    { 
		Scanner in;
		
		System.out.println("Beginning password analysis...\n");
		
		try   {
		System.out.println("Opening file Pwd.txt\n");
		File passwords = new File("pwd.txt");
		in = new Scanner(passwords);
		}
		catch(Exception e)
		{
		System.out.println("\nFile not found.");
		return;
		}
		File invalidPwd = new File("invalidPwd.txt");   
		File validPwd = new File("validPwd.txt");   
		invalidPwd.createNewFile();
		validPwd.createNewFile();
		FileWriter invalidFile = new FileWriter(invalidPwd);  
		FileWriter validFile = new FileWriter(validPwd); 
		while(in.hasNextLine())  {  
		String line = in.nextLine();
		if(hasUpper(line) && hasLower(line) && hasNumber(line) && hasSpecial(line))
		validFile.write(line + "\n");
		else
		invalidFile.write(line + "\n");
		}
		System.out.println("Analysis complete. Closing files.\n");
		invalidFile.close();   
		validFile.close();
		System.out.println("Results can be found in files 'invalidPwd.txt' and 'validPwd.txt' in the " + System.getProperty("user.dir") + " directory.");
		in.close();
}
	
		public static boolean hasUpper(String line) {
		char ch;
		for(int i = 0; i < line.length(); i++)  {
		ch = line.charAt(i);
		if(Character.isUpperCase(ch))
		return true;
		}
		return false;
		}

	public static boolean hasLower(String line) { 
		char ch;
		for(int i = 0; i < line.length(); i++)    {
		ch = line.charAt(i);
		if(Character.isLowerCase(ch))
		return true;
		}
		return false;
		}
		
	public static boolean hasNumber(String line)  { 
		char ch;
		for(int i = 0; i < line.length(); i++)  {
		ch = line.charAt(i);
		if(Character.isDigit(ch))
		return true;
		}
		return false;
		}

	public static boolean hasSpecial(String line)  {  
		if(line.indexOf('#') != -1)
		return true;
		if(line.indexOf('*') != -1)
		return true;
		if(line.indexOf('&') != -1)
		return true;
		if(line.indexOf('@') != -1)
		return true;
		if(line.indexOf('%') != -1)
		return true;
		if(line.indexOf('-') != -1)
		return true;
		return false;
		}	
}
