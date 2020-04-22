// File: Pointers1.cpp
// Declaring and dereferencing pointers
# include <iostream>
using namespace std;

int main(){
	int x = 4750;
	int *p = &x;
	
	cout << "Address of x: &x = " << &x << endl;
	cout << "Value of x's address: x = " << x << endl;
	
	cout << endl;
	
	cout << "Address of p: &p = " << &p << endl;
	cout << "Value store at p's address: p = " << p << endl;
	
	// p's value is x's address
	
	cout << endl;
	cout << "Dereference p to get x'x value: *p = " << *p << endl;
	return EXIT_SUCCESS;
}