// File Larger.cpp
// Function Overloading
#include <iostream>
using namespace std;

// Function Prototypes
int larger(int, int);
int larger(int, int, int);

int main(){
	int i, j, k, bigger;
	cout << "Enter three integers: ";
	cin >> i >> j >> k;
	
	bigger = larger(i, j, k);
	cout << bigger << " is bigger." << endl;
	
	return EXIT_SUCCESS;
	
}

int larger(int x, int y){
	return x > y ? x : y;
}

int larger(int x, int y, int z){
	return larger(x, larger(y, z));
}
