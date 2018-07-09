//Kevin Nguyen
//Basic C (C files) program for file operations. This program will create, edit, open, close, and read files.

/*
How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "gcc *.c" to compile c files
	3.) type in "a.out" to run out file
*/

//include statements
#include <stdio.h>

//function definitions
void fileCreateWrite();
void fileOpenRead();

//main driver
int main() {
	//create and write
	fileCreateWrite();

	//open and read
	fileOpenRead();

  	return 0;
}

//fileCreateWrite will create a file and write to it if needed
void fileCreateWrite() {
	//create file w/ "a" = append / "w" = write
	FILE *myFile = fopen("Sample.txt", "a");
	
	//check if file open successfully
	if(myFile != NULL) {
		fprintf(myFile, "Hello there!\n");
	
		//close file
		fclose(myFile);
	}
}

//fileOpenRead will open a file and read in the contents
void fileOpenRead() {
	int c;
	FILE *myFile = fopen("Sample.txt", "r");

	//check if file was opened
	if(myFile != NULL) {
		//loop through every character in stream until EOF
		while((c = getc(myFile)) != EOF) {
			putchar(c); //to stdout
		}
		fclose(myFile);
	}
}