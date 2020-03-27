// File: Global1.cpp
#include <iostream>
using namespace std;

int g; // global Variable

void func();

int main(){
	g = 10;
	cout << "In main, global is g = " << g << endl;
	func();
	cout << "Back in main, global is g = " << g << endl;
	
	return EXIT_SUCCESS;
}

void func(){
	// Global variable is accessable from within a function
	cout << "     In func, global is g = " << g << endl;
	g++;
	cout << "     New value of global is g = " << g << endl;
}