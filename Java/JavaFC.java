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

	//main driver
	public static void main(String[] args) {
		//create file
		createMyFile();

		//edit file
		editMyFile();

		//open file
		openMyFile();

		//read file
		readMyFile();

		//close file
		closeMyFile();
	}

	//function definitions below	

	//create a small text file
	public static void createMyFile() {
		try {
			File myFile = new File("test.txt");

			//if this file doesn't exist then create it
			if(!file.exists()) {
				myFile.createNewFile();
			}
		}
		catch (IOException e) {
			System.err.println("FILE CREATE ERROR");
		}
	}

	//edit a file
	public static void editMyFile() {
		try {
			System.out.println("WRITE")
		}
		catch (IOException e) {
			System.err.println("FILE WRITE ERROR");
		}
	}

	//open a file
	public static void openMyFile() {
		try {
			System.out.println("OPEN")
		}
		catch (IOException e) {
			System.err.println("FILE OPEN ERROR");
		}
	}

	//read a file
	public static void readMyFile() {
		try {
			System.out.println("READ")
		}
		catch (IOException e) {
			System.err.println("FILE READ ERROR");
		}
	}

	//close file
	public static void closeMyFile() {
		try {
			System.out.println("CLOSE")
		}
		catch (IOException e) {
			System.err.println("FILE CLOSE ERROR");
		}
	}
}