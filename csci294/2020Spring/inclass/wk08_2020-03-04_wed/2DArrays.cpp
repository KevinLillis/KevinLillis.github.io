/* 2DArrays.cpp */
#include <iostream>
#include <iomanip>
using namespace std;

int sum(int array[], int size);

void function1(){
	const int ROWS{4}, COLS{5};
	int array[ROWS][COLS]{};
	
	for(int r{0}; r < ROWS; r++){
		for(int c{0}; c < COLS; c++) {
			cout << array[r][c] << " ";
		}
		cout << endl;
	}
}

void function2(){
	const int ROWS{4}, COLS{5};
	int array[ROWS][COLS]{};
	int value{1};
	int width{4};
	
	for(int r{0}; r < ROWS; r++){
		for(int c{0}; c < COLS; c++) {
			array[r][c] = value++;
		}
		cout << endl;
	}
	
	for(int r{0}; r < ROWS; r++){
		for(int c{0}; c < COLS; c++) {
			cout << setw(width) << array[r][c];
		}
		cout << endl;
	}
}

void function3(){
	int array[][3] = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
		{2, 4, 6},
		{1, 3, 5}
	};
	
	for(int r{0}; r < 5; r++){
		for(int c{0}; c < 3; c++) {
			cout << array[r][c] << " ";
		}
		cout << endl;
	}
}

void function4(){
	int array[][3] = {
		1, 2, 3,
		4, 5, 6,
		7, 8, 9,
		2, 4, 6,
		1, 3, 5
	};
	
	for(int r{0}; r < 5; r++){
		for(int c{0}; c < 3; c++) {
			cout << array[r][c] << " ";
		}
		cout << endl;
	}
}

void function5(){
	const int ROWS{7}, COLS{6};
	int matrix[ROWS][COLS] = {
		{9, 33, 57},
		{},
		{2, 5, 6, 7, 6, 5},
		{},
		{},
		{1, 2, 3, 4, 5},
		{34, 34, 2}
	};
	
	for(int r{0}; r < ROWS; r++){
		for(int c{0}; c < COLS; c++) {
			cout << setw(3) << matrix[r][c];
		}
		cout << endl;
	}
	
	int largest{matrix[0][0]};

	for(int r{0}; r < ROWS; r++){
		for(int c{0}; c < COLS; c++) {
			if(matrix[r][c] > largest){
				largest = matrix[r][c];
			}
		}
	}
	
	cout << "Largest number is " << largest << endl;

}

void function6(){
	const int ROWS{7}, COLS{6};
	int matrix[ROWS][COLS] = {
		{9, 33, 57},
		{},
		{2, 5, 6, 7, 6, 5},
		{},
		{},
		{1, 2, 3, 4, 5},
		{34, 34, 2}
	};
	
	for(int r{0}; r < ROWS; r++){
		for(int c{0}; c < COLS; c++) {
			cout << setw(3) << matrix[r][c];
		}
		cout << endl;
	}

	for(int r{0}; r < ROWS; r++){
		cout << "total for row " << r << " = " 
			<< sum(matrix[r], COLS) << endl;
	}
}


int main() {
//	function1();
//	function2();
//	function3();
//	function4();
//	function5();
	function6();
	
}

int sum(int array[], int size){
	int total{0};
	for(int i = 0; i < size; i++){
		total += array[i];
	}
	return total;
}
