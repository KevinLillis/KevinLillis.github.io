// TimeTester4.cpp
// Version 4: The class definition and the class implementation are in 
// separate files.

//# include <iostream>
# include "TimeClass4.h"
using namespace std;

int main() {
	Time meetingTime; // Creates a new default Time object
	
	// show what the default constructor does
	cout << "Default time is " << meetingTime.str() << endl;
	
	// Change the time
	meetingTime.setTime(10, 10, 10);
	cout << "New time is " << meetingTime.str() << endl;
	
	return EXIT_SUCCESS;
}