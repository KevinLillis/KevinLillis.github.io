// File: DanglingPointers.cpp
// Show how a dangling pointer might be 
// created.
# include <iostream>
using namespace std;

int main() {

	int *p, *q;
	
	q = new int;
	p = q;
	*q = 999;
	
	cout << "*p = " << *p << endl;
	cout << "*q = " << *q << endl;
	
	*q = 1000;

	cout << "*p = " << *p << endl;
	cout << "*q = " << *q << endl;
	
	delete q;
	
	*p = 11; // Write to unallocated memory

    return EXIT_SUCCESS;
}
