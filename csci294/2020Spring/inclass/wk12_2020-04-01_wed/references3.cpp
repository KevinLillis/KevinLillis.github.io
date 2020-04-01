// File: references3.cpp
#include<iostream>
using namespace std;

void squareAndDouble(int x, int & xSquared, int & xDoubled);

int main(){
	int number{9}, squared{}, doubled{};
	
	squareAndDouble(number, squared, doubled);
	
	cout << "number  = " << number << endl
	     << "squared = " << squared << endl
		 << "doubled = " << doubled << endl;
	
	return EXIT_SUCCESS;
}

void squareAndDouble(int x, int & xSquared, int & xDoubled){
	xSquared = x * x;
	xDoubled = x + x;
}