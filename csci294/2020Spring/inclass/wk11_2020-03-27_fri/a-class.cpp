# include <iostream>
using namespace std;

// Each constructor is independent.

class aClass {
	
private:
	int x{};
	int y{};

public:
	aClass() {
		x = 1;
		y = 2;
	}
	
	aClass(int a) {
		x = a;
		y = 2;
	}
	
	aClass(int a, int b){
		x = a;
		y = b;
	}

	void printValues(){
		cout << "(x, y) = (" << x << ", " << y << ")" << endl;
	}
	
};


int main() {
	aClass q;
	q.printValues();
	cout << "-----------------------------------------" << endl;

	aClass r(33);
	r.printValues();
	cout << "-----------------------------------------" << endl;

	aClass s(44, 55);
	s.printValues();
	
	return EXIT_SUCCESS;
}