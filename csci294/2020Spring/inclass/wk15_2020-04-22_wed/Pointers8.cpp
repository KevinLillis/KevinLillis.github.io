// File: Pointers8.cpp
// Casting Pointers
# include <iostream>
using namespace std;

int main() {
	int intVal = 10;
	double doubleVal = 11.11;
	
	int *intPtr = &intVal;
	double *doublePtr = &doubleVal;
	
	cout << "Normal use of pointers" << endl;
	cout << "intVal        = " << intVal << endl
	     << "*intPtr       = " << *intPtr << endl
		 << "doubleVal     = " << doubleVal << endl
		 << "*doublePtr    = " << *doublePtr << endl;
		 
	// Make both pointer point to the same memory location
	// Cast the double pointer as an int pointer
	cout << endl;
	intPtr = (int *)doublePtr;
	
	// Verify both pointers point to the same memory locaiton
	cout << "Both pointers point to the same memory location" << endl;
	cout << "intPtr     = " << intPtr << endl;
	cout << "doublePtr  = " << doublePtr << endl;
	
	// View the memory location as an int and as a double
	cout << endl;
	cout << "View the memory location as anint and a double" << endl;
	cout << "*intPtr     = " << *intPtr << endl;
	cout << "*doublePtr  = " << *doublePtr << endl;
	
	// Use the int pointer to view the memory as a double
	cout << endl;
	cout << "Use the int pointer to view the memory as a double" << endl;
	cout << "1) Get to the memory location itself" << endl;
	cout << "   (double *)intPtr = " << (double *)intPtr << endl;
	cout << "2) Dereference that that location as a double" << endl;
	cout << "   *(double *)intPtr = " << *(double *)intPtr << endl;

	
    return EXIT_SUCCESS;
}
