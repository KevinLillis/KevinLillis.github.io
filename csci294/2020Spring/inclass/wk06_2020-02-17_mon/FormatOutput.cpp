#include<iostream>
#include<iomanip>
using namespace std;

void width();
void justification();

int main() {
	width();
	justification();

	return EXIT_SUCCESS;
}

void width() {
	cout << endl << string(44, '=')  << endl << "width()" << endl;

	int x{ 1234 };
	cout << "[" << x << "]" << endl;

	cout << "[" << setw(12) << x << "]" << endl;

	cout << "[" << x << "]" << endl;

}

void justification() {
	cout << endl << string(44, '=') << endl << "justification()" << endl;

	int x{ 1234 };
	cout << left;
	cout << "[" << setw(12) << x << "]" << endl;

	cout << right;
	cout << "[" << setw(12) << x << "]" << endl;

	// Internal justification. Sign is left justified, number is right
	cout << setw(9) << -3.25 << endl;
	cout << internal << setw(9) << -3.25 << endl;
	cout << internal << setw(9) << -3.256 << endl;

}