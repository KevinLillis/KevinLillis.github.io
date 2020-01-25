/*
	if_LetterGrade.cpp
	Prompts user for numeric score. Calculates and displays letter grade.
*/

#include <iostream>
using namespace std;

int main() {
	int score{ 0 };

	cout << "Enter a numeric score: ";
	cin >> score; 

	if (score >= 90) {
		cout << "Grade is A";
	}
	else if (score >= 80) {
		cout << "Grade is B";
	}
	else if (score >= 70) {
		cout << "Grade is C";
	}
	else if (score >= 60) {
		cout << "Grade is D";
	} 
	else {
		cout << "Grade is F";
	}
	cout << endl;

	return EXIT_SUCCESS;

}