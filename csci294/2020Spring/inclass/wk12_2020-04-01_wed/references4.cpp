// File: references4.cpp
#include<iostream>
using namespace std;

int squareByRef(const int & x);

int main(){
	int number{9};
	int result{};
	
	result = squareByRef(number);
	
	cout << number << " squared = " << result << endl;
	
	return EXIT_SUCCESS;
}

int squareByRef(const int & x){
	// x = x * x; This causes an error
	return x * x;
}