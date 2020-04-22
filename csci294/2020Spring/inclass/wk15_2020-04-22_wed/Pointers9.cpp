// File: Pointers9.cpp
// Function Pointers 1
# include <iostream>
using namespace std;

int add(int, int);
int mul(int, int);

int main() {
	int (* functionPtr)(int, int){};
	
	functionPtr = add;
	cout << "functionPtr(3, 5) = " << functionPtr(3, 5) << endl;
	
	functionPtr = mul;
	cout << "functionPtr(3, 5) = " << functionPtr(3, 5) << endl;
	

    return EXIT_SUCCESS;
}

int add(int x, int y){
	return x + y;
}

int mul(int x, int y){
	return x * y;
}
