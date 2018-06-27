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

		//open file
		openMyFile();

		//read file
		readMyFile();

		//close file
		closeMyFile();
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

	//open a file
	public static void openMyFile() {
		// try {
		// 	System.out.println("OPEN");
		// }
		// catch (IOException e) {
		// 	System.err.println("FILE OPEN ERROR");
		// }
	}

	//read a file
	public static void readMyFile() {
		// try {
		// 	System.out.println("READ");
		// }
		// catch (IOException e) {
		// 	System.err.println("FILE READ ERROR");
		// }
	}

	//close file
	public static void closeMyFile() {
		// try {
		// 	System.out.println("CLOSE");
		// }
		// catch (IOException e) {
		// 	System.err.println("FILE CLOSE ERROR");
		// }
	}
}