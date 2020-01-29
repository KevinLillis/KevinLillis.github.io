/* do_InputValidation.cpp */
#include<iostream>
using namespace std;

int main() {
	int value = { 0 }; // this is where we will save the number entered

	do {
		cout << "Enter a value from 1 to 10: ";
		cin >> value;
	} while (!(1 <= value && value <= 10));

	cout << "Good, you entered " << value << endl;

	return EXIT_SUCCESS;
}