// TimeClass3.cpp
// A class representing time of day
// Version 3: The file containing the class definition and implementation is
// different from the file with the main() function.
// This cpp file contains only the program using the Time class

# include "TimeClass3.h"
using namespace std;

int main() {
	Time meetingTime; // Creates a new default Time object
	
	// show what the default constructor does
	cout << "Default time is " << meetingTime.str() << endl;
	
	// Change the time
	meetingTime.setTime(9, 33, 25);
	cout << "New time is " << meetingTime.str() << endl;
	
	return EXIT_SUCCESS;
}