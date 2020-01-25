/* AddingTwoNumbers.cpp */

#include<iostream>
using namespace std;

int main() {
	int number1 { 0 }; // Declare variable and initialize to zero
	int number2 { 0 };
	int sum{ 0 };

	cout << "Enter first number: ";
	cin >> number1;

	cout << "Enter second number: ";
	cin >> number2;

	sum = number1 + number2;

	cout << number1 << " + " << number2 << " = " << sum << endl;

	return EXIT_SUCCESS;
}

