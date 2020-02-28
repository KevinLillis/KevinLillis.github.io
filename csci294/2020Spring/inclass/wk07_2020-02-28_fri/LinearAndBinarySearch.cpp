/* Even More Array Stuff.cpp */

#include <iostream>
#include <sstream>
#include <ctime>
using namespace std;

void print (int array[], int size);
string toString(int array[], int size);
void copy(int arr1[], int size1, int arr2[], int size2);
void swap(int array[], int i, int j);
int randBetween(int min, int max);
void staticExample();
void shuffle(int array[], int size);
void randomize(int array[], int size, int low, int high);
int linearSearch(int array[], int size, int key);
int binarySearch(int array[], int size, int key);

int main() {

//	// ======================================== linear search
//	const int LENGTH{10};
//	int numbers[LENGTH] = {5, 23, 7, 54, 12, -19, 99, 102, 16, 23};
//	int lookingFor{19};
//	int foundAt = linearSearch(numbers, LENGTH, lookingFor);
//	print(numbers, LENGTH);
//	cout << lookingFor << " was found at " << foundAt;


	// ======================================== binary search
		const int LENGTH{10};
		int numbers[LENGTH] = {10, 11, 14, 15, 20, 33, 45, 57, 57, 58};
		int lookingFor{60};
		int foundAt = binarySearch(numbers, LENGTH, lookingFor);
		print(numbers, LENGTH);
		if(foundAt >= 0){
			cout << lookingFor << " was found at " << foundAt;
		} else {
		cout << lookingFor << " not found. Add at position " << (-foundAt - 1);
		}
	
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

void swap(int array[], int i, int j){
	int temp = array[i];
	array[i] = array[j];
	array[j] = temp;
}

// Returns a random int r selected UAR from [min, max]
int randBetween(int min, int max){
	// must incluce <ctime> header file
	// Only seeds random number generator the first time
	static bool firstTime{true};
	if(firstTime){
		srand(time(0));
		firstTime = false;	
	}
	int low{}, high{};

	if(min < max){
		low = min;
		high = max;
	} else {
		low = max;
		high = min;
	}
	
	return low + (rand() % (high - low + 1));
	
}

void staticExample(){
	static int value{1};
	value++;
	cout << "value = " << value << endl;
}

void shuffle(int array[], int size){
	int i{}, j{};
	for(i = 0; i < size - 1; i++){
		// last value of i is the second to last array element
		j = randBetween(i, size - 1);
		swap(array, i, j);
	}
}

void randomize(int array[], int size, int x, int y){
		for(int i{0}; i < size; i++){
			array[i] = randBetween(x, y);
		}
}

int linearSearch(int array[], int size, int key){
	for (int i = 0; i < size; i++){
		if (array[i] == key){
			return i;
		}
	}
	
	// If we get here, the key must not be in the array, otherwise
	// we would have returned from the for loop.
	return -1;
}

int binarySearch(int array[], int size, int key){
	// Precondition: array must be sorted in non-decreasing order
	int low{0};
	int high{size-1};
	int mid{};
	
	while(low <= high){
		mid = (low + high)/2;
		if(key == array[mid]){
			return mid;
		} else if(key < array[mid]){
			high = mid - 1;
		} else {
			// key must be > the middle item
			low = mid + 1;
		}
	}
	
	// key is not in the array
	int result{-low -1};
	return result;
	// if we wanted to add the key to the array and keep the array
	// sorted, we sould add it at position -result - 1
}