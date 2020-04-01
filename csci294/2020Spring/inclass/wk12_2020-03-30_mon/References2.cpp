// File: References2.cpp

#include <iostream>
using namespace std;

int squareByValue(int x);
int squareByReference(int &x);

int main(){
	int number{8};
	int result{};
	
	cout << "Initial number == " << number << endl << endl;
	
	// Pass by Value Example
	cout << "Pass by value" << endl;
	result = squareByValue(number);
	cout <<"result = " << result << "  number = " << number << endl << endl;
	

	// Pass by Value Reference
	cout << "Pass by reference" << endl;
	result = squareByReference(number);
	cout <<"result = " << result << "  number = " << number << endl << endl;

	return EXIT_SUCCESS;
}


int squareByValue(int x){
	x = x * x;
	return x;
}

int squareByReference(int &x) {
	x = x * x;
	return x;
}