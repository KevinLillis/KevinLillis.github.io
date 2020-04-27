// File: Dynamic
// Dynamic Memory Allocation
# include <iostream>
using namespace std;

int main() {

	// Dynamically allocate memory
	int *iPtr = new int(5);
	double *dPtr = new double{};
	
	// Use the pointers
	*dPtr = 3.3;
	
	cout << "*iPtr = " << *iPtr << endl;
	cout << "*dPtr = " << *dPtr << endl;
	
	// Release the memory
	delete iPtr;
	delete dPtr;
	
    return EXIT_SUCCESS;
}
