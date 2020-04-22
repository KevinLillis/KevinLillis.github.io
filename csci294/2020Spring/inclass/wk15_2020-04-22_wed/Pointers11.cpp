// File: Pointers11.cpp
// Void Pointers
# include <iostream>
using namespace std;

int main() {
	// Declare pointer
	void * vPtr; // a void pointer
	
	// Declare numeric variables
	short short_val = -6;
	double double_val = 789.1234;
	unsigned long ulong_val = 123456789;
	
	// Display value of the variables
	cout << "Value of the variables" << endl;
	cout << "short_val  = " << short_val << endl;
	cout << "double_val = " << double_val << endl;
	cout << "ulong_val  = " << ulong_val << endl;
	
	// Use the void pointer to point to variables of different types
	cout << endl;
	cout << "Use the void pointer to point to variables of different types" << endl;
	
	vPtr = &short_val;
	cout << "*(short *)vPtr             = " << *(short *)vPtr << endl;
	
	vPtr = &double_val;
	cout << "*(double *)vPtr            = " << *(double *)vPtr << endl;

	vPtr = &ulong_val;
	cout << "*(unsigned long *)vPtr     = " << *(unsigned long *)vPtr << endl;
	
	// copy a double pointer to a void pointer
	cout << endl;
	cout << "copy a double pointer to a void pointer" << endl;
	
	double * dPtr; // a double pointer
	dPtr = &double_val;
	vPtr = dPtr;
	cout << "*(double *)vPtr            = " << *(double *)vPtr << endl;
	
	// Void pointers MUST be cast before they can be used
	// cout << *vPtr; // This causes an error.

    return EXIT_SUCCESS;
}
