# include <iostream>
using namespace std;

// Just one constructor with default argument values

class cClass {

private:
	int x{};
	int y{};
	
public:
	cClass(int a = 1, int b = 2){
		x = a;
		y = b;
	}
	
	void printValues(){
		cout << "(x, y) = (" << x << ", " << y << ")" << endl;
	}
	
};


int main() {
	cClass q;
	q.printValues();
	cout << "-----------------------------------------" << endl;

	cClass r(33);
	r.printValues();
	cout << "-----------------------------------------" << endl;

	cClass s(44, 55);
	s.printValues();
	
	return EXIT_SUCCESS;
}