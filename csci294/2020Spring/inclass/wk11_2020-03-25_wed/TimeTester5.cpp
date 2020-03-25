// TimeTester5.cpp
// Version 5: Add macros to prevent multiple inclusion of header file

# include <iostream>
# include "TimeClass5.h"
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