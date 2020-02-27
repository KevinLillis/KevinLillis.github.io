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

int main() {
	// ====================================== swap
//	const int SIZE = 10;
//	int array[10] = {4, 54, 3, 67, 4, 33, 5, -9, 4, 3};
//	print(array, SIZE);
//	swap(array, 3, 8);
//	print(array, SIZE);

//	// =================================== static example
//	staticExample();
//	staticExample();
//	staticExample();
	
//	// ====================================== rand between
//	for(int i = 0; i < 20; i++){
//		cout << randBetween(8, 15) << " ";
//	}
//	cout << endl;
	
//	// ======================================= shuffle
//		const int SIZE = 10;
//		int array[SIZE] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		print(array, SIZE);
//		shuffle(array, SIZE);
//		print(array, SIZE);

	// ======================================== randomize
	const int LENGTH = 10;
	int myArray[LENGTH]{};

	print(myArray, LENGTH);
	randomize(myArray, LENGTH, 4, 10);
	print(myArray, LENGTH);
	
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
