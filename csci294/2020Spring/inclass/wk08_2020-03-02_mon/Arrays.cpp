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
void insertionSort(int arr[], int size);
int sumArray(int arr[], int size);
int findMin(int arr[], int size);
int findMinIndex(int arr[], int size);

int main() {
	
//	// ============================================ insertion sort
//	const int LENGTH = 10;
//	int numbers[LENGTH];
//	randomize(numbers, LENGTH, 10, 25);
//	cout << toString(numbers, LENGTH) << endl;
//	insertionSort(numbers, LENGTH);
//	cout << toString(numbers, LENGTH) << endl;

//	// ================================================ sum array elements
//	const int SIZE = 100;
//	int values[SIZE];
//	for(int i{0}; i < SIZE; i++){
//		values[i] = i + 1;
//	}
//	int sum = sumArray(values, SIZE);
//	cout << "The sum is " << sum << endl;


	// ================================================ min index
	const int SIZE = 10;
	int values[SIZE] = {45, 33, 23, 8, 43, 12, 54, 9, 34, 10};
	cout << "min index is " << findMinIndex(values, SIZE) << endl;
	cout << "Its value is " << findMin(values, SIZE) << endl;
	
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

void insertionSort(int arr[], int size){
	int temp{}, i{}, j{};
	for(i = 1; i < size; i++){
		temp = arr[i];
		j = i;
		while(j > 0 && arr[j-1] > temp){
			arr[j] = arr[j-1];
			j--;
		}
		arr[j] = temp;
	}
}

int sumArray(int arr[], int size){
	int total{0};
	for(int i{0}; i < size; i++){
		total += arr[i];
	}
	return total;
}

int findMin(int arr[], int size){
	return arr[findMinIndex(arr, size)];
		
}

int findMinIndex(int arr[], int size){
	int minIndex{0};  // consider first element the smallest
	for(int i{1}; i < size; i++){
		// do we have a new minimum value
		if(arr[i] < arr[minIndex]){
			minIndex = i;
		}
	}
	return minIndex;
}
