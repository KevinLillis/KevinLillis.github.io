// File: Pointers5.cpp
// Demonstate the sizeof operator
# include <iostream>
using namespace std;

int main(){
	
	double arr[16];
	size_t numElements = sizeof(arr)/sizeof(double);
	
	cout << "The array has " << numElements << " elements." << endl;
	cout << "Their values are:" << endl;
	
	for(size_t i = 0; i < numElements; i++){
		arr[i] = 2 * i;
	}

	for(size_t i = 0; i < numElements; i++){
		cout << arr[i] << " ";
	}
	
	cout << endl;

	return EXIT_SUCCESS;
}