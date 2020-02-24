/* Arrays.cpp */
#include <iostream>
using namespace std;

void arrayReference();
void init1();
void init2();
void init3();
void init4();
void init5();

int main() {
	//arrayReference();
	//init1();
	//init2();
	//init3();
	//init4();
	init5();
}

void arrayReference() {
	int arr[10];
	cout << "arr: " << arr << endl; // prints memory location of arr
}

void init1() {
	// Create the array
	const int SIZE{5};
	int array[SIZE];

	// Initialize the array
	for (int i{ 0 }; i < SIZE; i++) {
		array[i] = 1;
	}

	// Display the array
	for(int i{ 0 }; i < SIZE; i++) {
		cout << "array[" << i << "] = " << array[i] << endl;
	}

}

void init2() {
	const int LENGTH{ 7 };

	// Declare teh array and use default initial values
	double array[LENGTH] = {};

	// Display the array
	for (int i{ 0 }; i < LENGTH; i++) {
		cout << "array[" << i << "] = " << array[i] << endl;
	}

}

void init3() {
	const int LENGTH{ 5 };

	// Declare teh array and use default initial values
	double array[LENGTH] = {22.098, 12, 23.4, 15.98, 99.99};

	// Display the array
	for (int i{ 0 }; i < LENGTH; i++) {
		cout << "array[" << i << "] = " << array[i] << endl;
	}

}

void init4() {
	const int LENGTH{ 7 };

	// Declare teh array and use default initial values
	double array[LENGTH] = { 22.098, 12, 23.4, 15.98, 99.99 };

	// Display the array
	for (int i{ 0 }; i < LENGTH; i++) {
		cout << "array[" << i << "] = " << array[i] << endl;
	}

}

void init5() {
	// Declare teh array and use default initial values
	double array[] = { 228, 212, 23.499999, 15.98, -99.99, 44 };

	int length{ 6 };

	// Display the array
	for (int i{ 0 }; i < length; i++) {
		cout << "array[" << i << "] = " << array[i] << endl;
	}

}