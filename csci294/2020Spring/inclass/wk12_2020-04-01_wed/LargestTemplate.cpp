// File LargestTemplate.cpp
# include <iostream>
# include <string>
# include "LargestTemplate.h"

using namespace std;

int main(){
	int int1{9S}, int2{7}, int3{2};
	cout << "Using Integers" << endl;
	cout << int1 << ", " << int2 << ", " << int3 << endl;
	cout << largest(int1, int2, int3) << endl;
	
	string s1{"z"}, s2{"b"}, s3{"c"};
	cout << "Using Strings" << endl;
	cout << s1 << ", " << s2 << ", " << s3 << endl;
	cout << largest(s1, s2, s3) << endl;
	
	return EXIT_SUCCESS;
}