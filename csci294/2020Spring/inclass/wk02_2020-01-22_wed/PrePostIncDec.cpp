/* PrePostIncDec.cpp */
#include<iostream>
using namespace std;

int main() {
	int a{ 0 };
	int w{ 0 };

	// Pre-Increment
	a = 7;
	w = 0;
	cout << "----- Pre-Increment ---------------------------" << endl;
	cout << "Before : " << "w = " << w << "    a = " << a << endl;
	cout << "w = ++a" << endl;
	w = ++a;
	cout << "After :  " << "w = " << w << "    a = " << a << endl;
	cout << endl << endl;


	// Post-Increment
	a = 7;
	w = 0;
	cout << "----- Post-Increment ---------------------------" << endl;
	cout << "Before : " << "w = " << w << "    a = " << a << endl;
	cout << "w = a++" << endl;
	w = a++;
	cout << "After :  " << "w = " << w << "    a = " << a << endl;
	cout << endl << endl;


	// Pre-Decrement
	a = 7;
	w = 0;
	cout << "----- Pre-Deccrement ---------------------------" << endl;
	cout << "Before : " << "w = " << w << "    a = " << a << endl;
	cout << "w = --a" << endl;
	w = --a;
	cout << "After :  " << "w = " << w << "    a = " << a << endl;
	cout << endl << endl;


	// Post-Decrement
	a = 7;
	w = 0;
	cout << "----- Post-Decrement ---------------------------" << endl;
	cout << "Before : " << "w = " << w << "    a = " << a << endl;
	cout << "w = a--" << endl;
	w = a--;
	cout << "After :  " << "w = " << w << "    a = " << a << endl;

	return EXIT_SUCCESS;

}

