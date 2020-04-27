// File: DynamicArray.cpp
// Dynamic Array Creation. Creating arryas without
// knowing ahead of time the size of the array.

// Comple from the command line with:
//     cl /EHsc DynamicArray.cpp
//
// so we don't have to worry about adding
// try-catch blocks to the memory allocaiton
// statements.

# include <iostream>
using namespace std;

int main() {
	// declare variables
	int arraySize{};
	int *arr{};
	
	// Read user input (number of array elements wanted)
	cout << "How many array elements do you want? ";
	cin>> arraySize;
	
	// Allocate memory for the array
	arr = new int[arraySize];
	
	// Initialize the array elements
	for(int i = 0; i < arraySize; i++){
		arr[i] = i;
	}
	
	// Use the array (we'll just print it)
	for(int i = 0; i < arraySize; i++){
		cout << arr[i] << " ";
	}
	
	cout << endl;
	
	delete [] arr;
	

    return EXIT_SUCCESS;
}
