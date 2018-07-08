//Kevin Nguyen
//Basic C++ (Cpp) program for file operations. This program will create, edit, open, close, and read files.

/*
How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "g++ *.cpp" to compile c++ files
	3.) type in "a.out" to run out file
*/

//include statements
#include <cstdlib>
#include <iostream>
#include <fstream>
using namespace std;

//function definitions
void fileStartEdit();
void fileOpenRead();

//main driver
int main(int argc, char** argv) {
	//local declarations
	//TODO: implement basic file ops

	//create & edit
	fileStartEdit();

	//open & read
	fileOpenRead();

	//close

	cout << "Complete!" << endl;
	return 0;
}

//fileStartEdit will create a file or write to in
void fileStartEdit() {
	//create
	ofstream myFile;
	myFile.open("sample.txt", ios::app);
	
	//check if file was opened properly
	if(myFile.is_open()) {
		myFile << "Hi there!" << endl; //write
		myFile.close();
	}
}

//fileOpenRead will open a file and read in the contents
void fileOpenRead() {

}