/*
Kevin Nguyen
Basic Java program that will create, edit, open, and read files.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaFC"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaFC {
	//Global Declarations
	static final String fileName = "test.txt";

	//main driver
	public static void main(String[] args) {
		//create file
		File myFile = createMyFile();

		//edit file
		editMyFile(myFile);

		//read file
		readMyFile(myFile);
	}

	//function definitions below	

	//create a small text file
	public static File createMyFile() {
		File myFile = null;
		try {
			myFile = new File(fileName);

			//if this file doesn't exist then create it
			if(!myFile.exists()) {
				myFile.createNewFile();
			}
		}
		catch (IOException e) {
			System.err.println("FILE CREATE ERROR");
		}
		return myFile;
	}

	//edit a file
	public static void editMyFile(File myFile) {
		try {
			FileWriter fstream = new FileWriter(myFile, true); //true appends, false overwrites
			BufferedWriter out = new BufferedWriter(fstream);
			out.write("Sample test");
			out.flush();
			out.close();
		}
		catch (IOException e) {
			System.err.println("FILE WRITE ERROR");
		}
	}

	//read a file
	public static void readMyFile(File myFile) {
		try {
			Scanner scanner = new Scanner(myFile.toPath());
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		}
		catch (IOException e) {
			System.err.println("FILE READ ERROR");
		}
	}
}