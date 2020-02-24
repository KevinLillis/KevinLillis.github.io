/* MoreArraywStuff.cpp */

#include <iostream>
#include <sstream>
using namespace std;

void print (int array[], int size);
string toString(int array[], int size);
void copy(int arr1[], int size1, int arr2[], int size2);
void copy(int x, int y); // doesn't work

int main() {
	// =================== print and toString functions
//	int myArray[5] = {2, 4, 6, 7, 9};
//	print(myArray, 5);
//	cout << toString(myArray, 5);

	// ================================= copy function
//	const int LENGTH1 = 5;
//	const int LENGTH2 = 8;
//	int array1[] = { 1,  2,  3,  4,  5};
//	int array2[] = {10, 20, 30, 40, 50, 60, 70, 80};
//	print(array1, LENGTH1);
//	print(array2, LENGTH2);
//	copy(array1, LENGTH1, array2, LENGTH2);
//	cout << endl;
//	print(array1, LENGTH1);
//	print(array2, LENGTH2);
	
	// ============================= copy int (doesn't work)
	int x{10}, y{20};
	cout << "x = " << x << "      y = " << y << endl;
	copy(x, y);
	cout << "x = " << x << "      y = " << y << endl;

}

void print (int array[], int size){
	bool first = true;
	cout << "[";
	for(int i{0}; i < size; i++){
		if(first){
			cout << array[i];
			first = false;
		} else {
			cout << ", " << array[i];
		}
	}
	cout << "]" << endl;
}

string toString(int array[], int size){
	// must include <sstream>
	stringstream s;
	s.str(""); // make an empty string
	
	bool first = true;
	s << "[";
	for(int i{0}; i < size; i++){
		if(first){
			s << array[i];
			first = false;
		} else {
			s << ", " << array[i];
		}
	}
	s << "]" << endl;
	return s.str();
}

/*
	arr1 = arr2. Copy contents of arr2 into arr1
*/
void copy(int arr1[], int size1, int arr2[], int size2){
	if(size1 <= size2){
		// 1: x x x x x x
		// 2: x x x x x x x x x x
		for(int i{0}; i < size1; i++){
			arr1[i] = arr2[i];
		}
	} else {
		// 1: x x x x x x
		// 2: x x x x
		for(int i{0}; i < size2; i++){
			arr1[i] = arr2[i];
		}
	}
}

void copy(int x, int y){ // doesn't work
	x = y;
}