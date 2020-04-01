// File: Overloading.cpp

# include <iostream>
using namespace std;

int square(int);
long square(long);
float square(float);
double square(double);

int main(){
	int i{2};
	long el{4};
	float f{6};
	double d{8};
	
	cout << "square(i)  = " << square(i)  << endl
	     << "square(el) = " << square(el) << endl
		 << "square(f)  = " << square(f)  << endl
		 << "square(d)  = " << square(d)  << endl;
	
	
	return EXIT_SUCCESS;
}

int square(int x) {
	return x * x;
}

long square(long x) {
	return x * x;
}

float square(float x) {
	return x * x;
}

double square(double x) {
	return x * x;
}