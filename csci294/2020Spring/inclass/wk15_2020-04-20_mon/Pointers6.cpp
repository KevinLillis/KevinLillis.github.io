// File: Pointers6.cpp
// Pointer arithmetic
# include <iostream>
using namespace std;

int main(){
	int arr[5] = {100, 110, 120, 130, 140};
	
	int *arrPtrA{arr};
	int *arrPtrB{};
	int *arrPtrC{};
	
	int x{};
	
	// arrPtrA points to the first array element
	cout << " *arrPtrA = " << *arrPtrA << endl;
	
	// Make arrPtrA point to the 2nd array element
	arrPtrA++;
	cout << " *arrPtrA = " << *arrPtrA << endl;

	// Make arrPtrA point to the 4th array element
	// (move it forward two places in the array)
	arrPtrA += 2;
	cout << " *arrPtrA = " << *arrPtrA << endl;

	// Make arrPtrA point to the last array element
	arrPtrA = &arr[4];
	cout << " *arrPtrA = " << *arrPtrA << endl;

	// How many array elements are between two pointers
	arrPtrB = &arr[1];
	arrPtrC = &arr[4];

	cout << " *arrPtrB = " << *arrPtrB << endl;
	cout << " *arrPtrC = " << *arrPtrC << endl;

	x = arrPtrC - arrPtrB + 1;
	cout << "Number of elements, x = " << x << endl;

	return EXIT_SUCCESS;
}