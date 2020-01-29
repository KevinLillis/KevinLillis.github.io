/* misleading-bool-expression.cpp */
#include<iostream>
using namespace std;

int main() {
	// These Boolean expressions are valid, but might not do what you expect.
	
	// Example 1
	if (1 < 5 < 3) {
		// The expression is true because first, 1 < 5 gives 1 for true.
		// Then 1 < 3 is true
		cout << "(1 < 5 < 3) is true" << endl;
	}
	else {
		cout << "(1 < 5 < 3) is false" << endl;
	}

	// Example 2
	if (-10 < -5 < -3) {
		cout << "(-10 < -5 < -3) is true" << endl;
	}
	else {
		// The expression is false because first, -10 < -5 gives 1 for true.
		// Then 1 < -3 is false
		cout << "(-10 < -5 < -3) is false" << endl;
	}

	cout << endl;
	
	// The correct way to do these is:
	// Example 3
	if (1 < 5 && 5 < 3) {
		cout << "(1 < 5 && 5 < 3) is true" << endl;
	}
	else {
		cout << "(1 < 5 && 5 < 3) is false" << endl;
	}

	// Example 4
	if (-10 < -5 && -5 < -3) {
		cout << "(-10 < -5 && -5 < -3) is true" << endl;
	}
	else {
		cout << "(-10 < -5 && -5 < -3) is false" << endl;
	}	return EXIT_SUCCESS;
}