/* 2DArrayFunction.cpp */
#include <iostream>
using namespace std;

const int ROWS{4};
const int COLS{5};

void printArray(const int arr[][COLS], int rows, int cols);

int main() {
	int values[ROWS][COLS];
	for (int r{0}; r < ROWS; r++){
		for(int c{0}; c < COLS; c++){
			values[r][c] = r + c;
		}
	}
	
	printArray(values, ROWS, COLS);
	
	
}

void printArray(const int arr[][COLS], int rows, int cols){
	for (int r{0}; r < rows; r++){
		for(int c{0}; c < cols; c++){
			cout << arr[r][c] << " ";
		}
		cout << endl;
	}
}