// File: Pointers3.cpp

/* Doing "pass by reference" using pointers */
# include <iostream>
using namespace std;

int squareByValue(int x);
int squareByReference(int * x);

int main(){
	int number = 8;
	cout << "1) initial value of number = " << number << endl;
	cout << endl;
	
	cout << "2) number squared by value = " << squareByValue(number) << endl;
	cout << "   number is still equal to: number = " << number << endl;
	cout << endl;
	
	cout << "3) number squared by reference = " << squareByReference(&number) << endl;
	cout << "   number has been changed: number = " << number << endl;

	return EXIT_SUCCESS;
}

int squareByValue(int x){
	x = x * x;
	return x;
}

int squareByReference(int * x){
	*x = *x   *    *x;
	return *x;
}