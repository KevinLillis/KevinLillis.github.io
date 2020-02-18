/* FormatFloatingPoint.cpp */
#include <iostream>
#include <iomanip>
using namespace std;

void fixedScientific();
void precision();
void showPoint();

int main() {
	// Only run these one at a time for a good demo of each
	fixedScientific();
//	precision();
//	showPoint();
}

void fixedScientific(){
	cout << endl << string(44, '=') << endl;
	cout << "fixedScientific()" << endl;

	float small = 3.1415926535897932384626;
	float large = 6.0234567e17;
	float whole = 2.000000000;

	cout << "Some values in general format" << endl;
	cout << "small:  " << small << endl;
	cout << "large:  " << large << endl;
	cout << "whole:  " << whole << endl << endl;

	cout << scientific;

	cout << "The values in scientific format" << endl;
	cout << "small:  " << small << endl;
	cout << "large:  " << large << endl;
	cout << "whole:  " << whole << endl << endl;

	cout << fixed;

	cout << "The same values in fixed format" << endl;
	cout << "small:  " << small << endl;
	cout << "large:  " << large << endl;
	cout << "whole:  " << whole << endl << endl;

	// Doesn't work -- doesn't exist
	// cout << general;

	cout.unsetf(ios::fixed | ios::scientific);

	cout << "Back to general format" << endl;
	cout << "small:  " << small << endl;
	cout << "large:  " << large << endl;
	cout << "whole:  " << whole << endl << endl;

}
void precision(){
	cout << endl << string(44, '=') << endl;
	cout << "precision()" << endl;
	
	// For floating point numbers
	// n: Number of decimal places

	float x = 3.1415926535897932384626;
	cout << x << endl;
	
	cout << setprecision(6);
	// General formatting: total number of digits
	// before and after deimal point. 
	// doesn't include deimal point.
	cout << x << endl;
	
	// In fixed and scientific, digits after dexixmal point
	cout << fixed;
	cout << x << endl;
	
	cout << scientific;
	cout << x << endl;
}

void showPoint(){
	cout << endl << string(44, '=') << endl;
	cout << "showPoint()" << endl;

	// shows trailing zeros
	float lots = 3.1415926535;
	float little1 = 2.25;
	float little2 = 1.5;
	float whole = 4.00000;

	cout << "Some values with noshowpoint (the default)" << endl << endl;

	cout << "lots:    " << lots << endl;
	cout << "little1: " << little1 << endl;
	cout << "little2: " << little2 << endl;
	cout << "whole:   " << whole << endl;

	cout << endl << endl;

	cout << "The same values with showpoint" << endl << endl;

	cout << setprecision(9);
	cout << showpoint;

	cout << "lots:    " << lots << endl;
	cout << "little1: " << little1 << endl;
	cout << "little2: " << little2 << endl;
	cout << "whole:   " << whole << endl;	
}
