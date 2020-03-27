// File global2.cpp
# include <iostream>
using namespace std;

int g = 19;
void increment(int g);
void func();

int main(){
	cout << "1) in main, g = " << g << endl;
	increment(g);
	cout << "2) in main, g = " << g << endl;
	func();
	cout << "3) in main, g = " << g << endl;
	
	return EXIT_SUCCESS;
}

void increment(int g){
	g++;
	cout << "     in increment, g = " << g << endl;
}

void func() {
	int g{5};
	cout << "     in func, g = " << g << endl;
}