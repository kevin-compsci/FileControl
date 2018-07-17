#Kevin Nguyen
#Basic Python program for file operations. This program will create, edit, open, close, and read files.
#
#How to run (linux):
#	1.) open command line and cd into directory folder of where this code is
#	2.) type in "python Python-FC.py"

#import statements
import sys;
import array;

#Function implementation/definition below
#createFile creates a file (.txt) and returns it
def createFile():
	#TODO: implement basic file ops!
	f = open("sample.txt", "a+"); #'w'/'a' = overwrite/append and '+'' = create file if needed
	return f;

#writeFile will edit the file contents
def writeFile(f):
	i = 0;

	#loop 10 times and append or write to file
	while i < 10:
		f.write("i");
		i+=1;

#readFile will read hte file contents
def readFile():
	f = open("sample.txt", "r"); #read into file
	
	#check to ensure f is in read mode
	if f.mode == 'r':
		contents = f.readlines(); #get contents per line

		#for each line print their contents
		for c in contents:
			print(c); #print

#main driver below
myFile = createFile(); #create
writeFile(myFile); #write
myFile.close() #close
readFile(); #read
