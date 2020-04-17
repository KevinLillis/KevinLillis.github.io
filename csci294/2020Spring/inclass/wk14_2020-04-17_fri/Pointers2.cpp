// File: Pointers2.cpp
# include <iostream>
using namespace std;

int main(){
	int intVar    = 1234;    // integer variable with a value
	int * intPtr  = &intVar; // pointer assigned the memory location of intVar
	int &intRef   = intVar;  // an alias for intVar
	int *p        = &intRef; // point assinged intRev's memory address
	
	cout << " 1) Address of intVar: &intVar = " << &intVar << endl;
	cout << " 2) Value stored in intVar: intVar = " << intVar << endl;
	cout << endl;
	
	cout << " 3) Address of intPtr: &intPtr = " << &intPtr << endl;
	cout << " 4) Value stored in intPtr: intPtr = " << intPtr << endl;
	cout << endl;
	
	cout << " 5) Address of intRef: &intRef = " << &intRef << endl;
	cout << " 6) Value stored in intRef: intRef = " << intRef << endl;
	cout << endl;
	
	cout << " 7) Address of p: &p = " << &p << endl;
	cout << " 8) Value stored in p: p = " << p << endl;
	cout << endl;

	cout << " 9) intVar = "  << intVar << endl;
	cout << "10) *intPtr = " << *intPtr << endl;
	cout << "11) intRef = "  << intRef << endl;
	cout << "12) *p = "      << *p << endl;
	cout << endl;

	cout << "13) &intVar = " << &intVar << endl;
	cout << "14) intPtr = " << intPtr << endl;
	cout << "15) &intRef = " << &intRef << endl;
	cout << "16) p = " << p << endl; 
	return EXIT_SUCCESS;
}