/* ReadToEndOfFile.cpp */
#include <iostream>
# include<fstream>
using namespace std;


int main() {
	ifstream inFile{}; // Input file
	
	string inFileName{};

	cout << "Enter the name of the input file: ";
	cin >> inFileName;
	
	// Open file
	inFile.open(inFileName);
	if (!inFile) {
		cerr << "ERROR! Cannot open input file input.txt" << endl;
		return EXIT_FAILURE;
	}
	
	int number{}, sum{0};

	inFile >> number;
	while(!inFile.eof()){
		sum += number;
		cout << "added " << number << endl;
		inFile >> number;
	}
	cout << "sum = " << sum << endl;	
	
	
	inFile.close();

	return EXIT_SUCCESS;
	
}
