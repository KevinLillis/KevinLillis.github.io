// File: Pointers10.cpp
// Function Pointers 2, passing a function to a function
# include <iostream>
using namespace std;

// The following 2 function prototypes each take 2 int
// parameters and return an int
int max(int x, int y);
int min(int x, int y);

// This function prototype takes 3 arguments:
// 1) Pointer to a function with 2 int arguments and returns an int.
// 2) Second argument is an int
// 3) Third argument is also an int
int op(int (*)(int, int), int x, int y);

int main() {
	int a = 5, b = 10;
	
	// Call op and pas the three required parameter
	cout << "max = " << op(max, a, b) << endl;
	cout << "min = " << op(min, a, b) << endl;

    return EXIT_SUCCESS;
}

int max(int x, int y){
	return x > y ? x : y;
}

int min(int x, int y){
	return x < y ? x : y;
}

// Call the function that was passed as the first agument.
// Send to that function the second and third arguments
// passed to this function.
int op(int (*compare)(int, int), int x, int y){
	return (*compare)(x, y);
}