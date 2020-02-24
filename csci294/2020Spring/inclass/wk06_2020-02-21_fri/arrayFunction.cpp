/* arrayFunction.cpp */
#include <iostream>
using namespace std;

void initializeArray(int arr[], int size);

int main() {
	const int LENGTH = 4;
	int values[4];
	initializeArray(values, LENGTH);

	for (int i{ 0 }; i < LENGTH; i++) {
		cout << "values[" << i << "] = " << values[i] << endl;
	}
}

void initializeArray(int arr[], int size) {
	for (int i{ 0 }; i < size; i++) {
		arr[i] = 2 * i;
	}
}