// File: references5.cpp
#include<iostream>
using namespace std;


int main(){
	int x{11};
	int &y{x}; // y is an alias for x
	
	cout << "x = " << x << "   y = " << y << endl;
	
	// First, let's change the value of x
	x++;
	cout << "x = " << x << "   y = " << y << endl;
	
	// Now let's change the value of y
	y++;
	cout << "x = " << x << "   y = " << y << endl;

	return EXIT_SUCCESS;
}
