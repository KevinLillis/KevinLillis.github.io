/* Formatting.cpp */

#include <iostream>
#include <iomanip>

using namespace std;

void width();
void justification();
void internalJustification();
void fillCharacter();
void booleans();
void showpos();
void bases();
void showTheBase();
void upperHex();

int main() {
	// Only run these one at a time for a good demo of each

	width();
//	justification();
//	internalJustification();
//	fillCharacter();
//	booleans();
//	showpos();
//	bases();
//	showTheBase();
//	upperHex();

	

	return EXIT_SUCCESS;
}

void width(){
	cout << endl << string(44, '=') << endl;
	cout << "width()" << endl;
	
	int x = 1234;
	cout << "[" << x << "]" << endl;

	cout << "[" << setw(12) << x << "]" << endl;
	
	// width is one-time-only
	cout << "[" << x << "]" << endl;
	
}

void justification(){
	cout << endl << string(44, '=') << endl;
	cout << "justification()" << endl;

	unsigned int x = 5678;
	// Justification "sticks"
	cout << left;
	cout << "[" << setw(12) << x << "]" << endl;
	cout << "[" << setw(12) << x << "]" << endl;

	cout << right;
	cout << "[" << setw(12) << x << "]" << endl;
	cout << "[" << setw(12) << x << "]" << endl;
	
}

void internalJustification(){
	cout << endl << string(44, '=') << endl;
	cout << "internalJustification()" << endl;

	// sign is left, number is right
	cout << setw(9) << -3.25 << endl;
	cout << internal << setw(9) << -3.25 << endl;	
	cout << internal << setw(9) << -3.256 << endl;	
}

void fillCharacter(){
	cout << endl << string(44, '=') << endl;
	cout << "fillCharacter()" << endl;
	
	cout << setfill('#');
	cout << setw(12) << "Hello" << endl;
	cout << left;
	cout << setw(12) << "Hello" << endl;
}

void booleans(){
	cout << endl << string(44, '=') << endl;
	cout << "booleans()" << endl;

	// Printing bool values
	bool trueValue = 1 < 12;
	bool falseValue = 1 == 12;
	cout << "trueValue = " << trueValue << endl;
	cout << "falseValue = " << falseValue << endl;
	
	cout << boolalpha;
	cout << "trueValue = " << trueValue << endl;
	cout << "falseValue = " << falseValue << endl;
	
	cout << noboolalpha;
	cout << "trueValue = " << trueValue << endl;
	cout << "falseValue = " << falseValue << endl;

}

void showpos(){
	cout << endl << string(44, '=') << endl;
	cout << "showpos()" << endl;

	int pos = 12;
	int neg = -13;
	
	cout << pos << " " << neg << endl;
	
	cout << showpos;
	cout << pos << " " << neg << endl;
	
	cout << noshowpos;
	cout << pos << " " << neg << endl;

}
void bases(){
	cout << endl << string(44, '=') << endl;
	cout << "bases()" << endl;

	// These sequences of characters are treated as decimal numbers by 
	// the compiler and converted to the machine internal format.

	long int pos_value =  12345678;  
	long int neg_value = -87654321;
	float value = 2.71828;

	cout << "The decimal value 12345678 is printed out as" << endl;

	cout << "decimal:     " << pos_value << endl;
	cout << "octal:       " << oct << pos_value << endl;
	cout << "hexadecimal: " << hex << pos_value << endl << endl;

	cout << "The decimal value -87654321 is printed out as" << endl;
	cout << "decimal:     " << dec << neg_value << endl;
	cout << "octal:       " << oct << neg_value << endl;
	cout << "hexadecimal: " << hex << neg_value << endl << endl;

	cout << "The decimal value 2.71828 is printed out as" << endl;
	cout << "decimal:     " << dec << value << endl;
	cout << "octal:       " << oct << value << endl;
	cout << "hexadecimal: " << hex << value << endl << endl;	
}

void showTheBase(){
	cout << endl << string(44, '=') << endl;
	cout << "showTheBase()" << endl;

	long int value =  12345678;  

	cout << "The decimal value 12345678 is printed out with showbase as" << endl;

	cout << showbase;

	cout << "decimal:     " << value << endl;
	cout << "octal:       " << oct << value << endl;
	cout << "hexadecimal: " << hex << value << endl << endl;

	cout << "The decimal value 12345678 is printed out without showbase as" << endl;

	cout << noshowbase;

	cout << "decimal:     " << dec << value << endl;
	cout << "octal:       " << oct << value << endl;
	cout << "hexadecimal: " << hex << value << endl << endl;
	
}

void upperHex(){
	cout << endl << string(44, '=') << endl;
	cout << "upperHex()" << endl;

	long int value =  12345678;  
	float    value_f = 6020000000.0;

	cout << "Some values without the uppercase manipulator" << endl;
	cout << showbase << hex;
	cout << "hexadecimal: " << value << endl;
	cout << "exponential: " << value_f << endl << endl;

	cout << uppercase;

	cout << "Some values with the uppercase manipulator" << endl;
	cout << "hexadecimal: " << value << endl;
	cout << "exponential: " << value_f << endl << endl;
}