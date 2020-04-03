// File: c-string2.cpp

# include <iostream>
using namespace std;

int main(){
	char m1[] = "Last";
	const char m2[] = {'M', 'o', 'u', 's', 'e', NULL};
	
	cout << "m1: " << m1 << endl;
	cout << "m2: " << m2 << endl;
	cout << endl;
	
	cout << "m1[8] = " << m1[8] << " at memory " << (long)&m1[8] << endl;
	cout << "m2[0] = " << m2[0] << " at memory " << (long)&m2[0] << endl;
	
	cout << endl;
	// Change Last to Fast
	m1[0] = 'F';
	cout << "m1: " << m1 << endl;

	// Change Mouse to House
	// m2[0] = 'H';
	m1[8] = 'H';
	cout << "m2: " << m2 << endl;

	return EXIT_SUCCESS;
}