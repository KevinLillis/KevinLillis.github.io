// File: Pointers12.cpp
// NULL Pointers
# include <iostream>
using namespace std;

int main() {

	int x = 11;
	int *p{}; // Initialized to NULL
	
	if(p != NULL) {
		cout << "We don't exptect to see this" << endl;
		cout << "*p = " << *p << endl; // Does not execute
	}
	
	p = &x;
	
	if(p != NULL) {
		cout << "This is where we execute" << endl;
		cout << "*p = " << *p << endl;
	}
	
    return EXIT_SUCCESS;
}
