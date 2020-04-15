// Vectors.cpp
#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

// Function Prototypes
string str(const vector<int> & vect);
void constructors();
void sizeAndCapacity();

int main(){
	//constructors();
	sizeAndCapacity();
	
	return EXIT_SUCCESS;
}

string str(const vector<int> & vect){
	stringstream s;
	s.str("");
	bool first = true;
	s << "[";
	for(int x : vect) {
		if(first){
			s << x;
			first = false;
		} else {
			s << ", " << x;
		}
	}
	s << "]";
	
	s << " cap = " << vect.capacity();
	s << ", size = " << vect.size();
	
	return s.str();
}

void constructors() {
	cout << "default constructor" << endl;
	vector<int> vec1;
	cout << str(vec1) << endl;
	
	vec1.push_back(12);
	cout << str(vec1) << endl;
	
	vec1.push_back(13);
	cout << str(vec1) << endl;

	vec1.push_back(14);
	cout << str(vec1) << endl;
	
	cout << endl << "Specify initial Capacity" << endl;
	vector<int> vec2(6);
	cout << str(vec2) << endl;
	
	cout << endl << "Specify initial capacity and values" << endl;
	vector<int> vec3(6, 5);
	cout << str(vec3) << endl;
	
	cout << endl << "Specify initial values" << endl;
	vector<int> vec4{2, 3, 5, 7, 11, 13, 17};
	cout << str(vec4) << endl;
	
	cout << endl << "Copy Constructor" << endl;
	vector<int> vec5(vec4);
	cout << str(vec5) << endl;
	
	cout << endl << "Assignmet operator for entire vector" << endl;
	vector<int> vec6;
	vec6 = vec5;
	cout << str(vec6);
	
	cout << endl << "Clearing all elements" << endl;
	vec6.clear();
	cout << str(vec6);
}

void sizeAndCapacity() {
	cout << endl << "Resize, specify new size" << endl;
	vector<int> vec1 {1, 2, 3};
	cout << str(vec1) << endl;
	
	vec1.resize(7);
	cout << str(vec1) << endl;
	
	cout << endl << "Resize, specify new size & new values" << endl;
	vector<int> vec2 {4, 5, 6};
	cout << str(vec2) << endl;
	
	vec2.resize(7, -1);
	cout << str(vec2) << endl;
	
}