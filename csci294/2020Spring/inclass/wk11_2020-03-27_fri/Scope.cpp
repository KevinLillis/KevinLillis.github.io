// File: Scope.cpp
#include <iostream>
using namespace std;

int x = 7; // global scope

int main(){
	cout << "global x = " << x << endl;
	
	int x{70}; // local scope in main
	cout << "local in main x = " << x << endl;
	
	{
		int x{700};
		cout << "block, x = " << x << endl;
		if(true){
			int x{7000};
			cout << "if scope, x = " << x << endl;
		}
		
		cout << "block ::x = " << ::x << endl;
	}
	
	return EXIT_SUCCESS;
}