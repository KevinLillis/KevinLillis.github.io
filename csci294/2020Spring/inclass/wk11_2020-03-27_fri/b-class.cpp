# include <iostream>
using namespace std;

// First constructor calls the second.
// Second constructor calls the third.
class bClass {
	
private:
	int x{};
	int y{};

public:
	bClass() : bClass(1) {
	}
	
	bClass(int a) : bClass(a, 2) {
	}
	
	bClass(int a, int b){
			x = a;
			y = b;
	}

	void printValues(){
		cout << "(x, y) = (" << x << ", " << y << ")" << endl;
	}
	
};


int main() {
	bClass q;
	q.printValues();
	cout << "-----------------------------------------" << endl;

	bClass r(33);
	r.printValues();
	cout << "-----------------------------------------" << endl;

	bClass s(44, 55);
	s.printValues();
	
	return EXIT_SUCCESS;
}