// File: Pointers4.cpp
// Pass by reference with pointers
# include <iostream>
using namespace std;

void squareAndDouble(int, int *, int *);

int main(){
	int value{7};
	int valueSquared{};
	int valueDoubled{};
	
	squareAndDouble(value, &valueSquared, &valueDoubled);
	
	cout << "value: " << value << endl;
	cout << "valueSquared: " << valueSquared << endl;
	cout << "valueDoubled: " << valueDoubled << endl;
	
	return EXIT_SUCCESS;
}

void squareAndDouble(int x, int *xSquared, int *xDoubled){
	*xSquared = x * x;
	*xDoubled = x + x;
}