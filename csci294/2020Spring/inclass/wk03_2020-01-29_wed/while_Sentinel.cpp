/* while_Sentinel.cpp */

// While loop for a sentinel controled loop
// Read numbers, -1 to quit
// print: largest, smallest, average

#include<iostream>
using namespace std;

int main() {
	int valueCounter{ 0 }; // to calculate average
	double valueSum{ 0 };
	int value{ 0 }; // the number read in
	int min{ INT_MAX }; // holds the minimum number entered
	int max{ INT_MIN }; // halds the maximum number entered
	double average{ 0 };

	// Read the first value
	cout << "Enter an integer value, -1 to quit: ";
	cin >> value;

	while (value != -1) {
		valueCounter++;
		valueSum += value;
		if (value > max) {
			max = value;
		}

		if (value < min) {
			min = value;
		}

		// read the next value
		cout << "Enter an integer value, -1 to quit: ";
		cin >> value;
	} // end while loop
	average = valueSum / valueCounter;

	// Display our results
	cout << "Largest value is " << max << endl;
	cout << "Smallest value is " << min << endl;
	cout << "Average is " << average << endl;

	return EXIT_SUCCESS;
}
