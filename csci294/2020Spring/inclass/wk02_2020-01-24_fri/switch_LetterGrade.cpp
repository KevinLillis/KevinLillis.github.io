/* switch_LetterGrade.cpp */

#include<iostream>
using namespace std;

int main() {
	int score{ 0 };

	cout << "Enter score: ";
	cin >> score;

	switch (score / 10) {
	case 10:
	case 9:
		cout << "Grade is A";
		break;
	case 8:
		cout << "Grade is B";
		break;
	case 7:
		cout << "Grade is C";
		break;
	case 6:
		cout << "Grade is D";
		break;
	default:
		cout << "Grade is F";
		break;
	} // end of switch

	cout << endl;
	return EXIT_SUCCESS;
}