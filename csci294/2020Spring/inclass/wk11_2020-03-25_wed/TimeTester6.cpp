// TimeTester6.cpp
// Version 6: Add constructor with values

# include <iostream>
# include "TimeClass6.h"
using namespace std;

int main() {
	Time t1;               // Uses defaults
	Time t2(8);
	Time t3(8, 15);
	Time t4(8, 15, 32);
	Time t5(-12, 32000, 100);
	
	cout << "t1 = " << t1.str() << endl;
	cout << "t2 = " << t2.str() << endl;
	cout << "t3 = " << t3.str() << endl;
	cout << "t4 = " << t4.str() << endl;
	cout << "t5 = " << t5.str() << endl;
	
	return EXIT_SUCCESS;
}