// File: Pointers7.cpp
// Four different way to access an Array
# include <iostream>
using namespace std;

int main(){

	int arr[5] = {100, 110, 120, 130, 140};
	int *iPtr;
	
	// iPtr points to the first element of arr
	iPtr = arr;
	cout << " *iPtr = " << *iPtr << endl;
	
	// iPtr again points to the first element of arr
	iPtr = &arr[0];
	cout << " *iPtr = " << *iPtr << endl;

	// Four ways to access the array
	// Normal way of using array subscripts
	cout << arr[1]       << endl;
	
	// Use pointer arithmetic
	cout << *(iPtr + 2)  << endl;
	
	// Treat the point ar an array name
	cout << iPtr[3]      << endl;
	
	// Treat the array name as a pointer
	cout << *(arr + 4)   << endl;
	
	cout << *(arr - 40)   << endl;
	

	return EXIT_SUCCESS;
}