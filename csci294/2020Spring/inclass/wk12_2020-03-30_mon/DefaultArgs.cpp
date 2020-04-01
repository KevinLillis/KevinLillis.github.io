// File: DefaultArgs.cpp

# include <iostream>
# include <iomanip>

using namespace std;

double cubeVolume(double length = 1.0, double width=2.0, double height=3.0);

int main() {
	cout << "DEFAULTS ARE: 1, 2, 3" << endl << endl;
	
	cout << "Specify L=10, W=20, H=30" << endl;
	cout << "volume = " << cubeVolume(10, 20, 30) << endl << endl;
	

	cout << "Specify L=10, W=20" << endl;
	cout << "volume = " << cubeVolume(10, 20) << endl << endl;


	cout << "Specify L=10" << endl;
	cout << "volume = " << cubeVolume(10) << endl << endl;


	cout << "Specify Nothing (use all defats)" << endl;
	cout << "volume = " << cubeVolume() << endl << endl;

	return EXIT_SUCCESS;
}

double cubeVolume(double length, double width, double height){
	return length * width * height;
}
