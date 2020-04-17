// Vectors.cpp
#include <iostream>
#include <sstream>
#include <vector>
using namespace std;

// Function Prototypes
string str(const vector<int> & vect);
void constructors();
void sizeAndCapacity();
void changingVector();
void pushBack();
void swapping();
void relationalOperators();

int main(){
	//constructors();
	//sizeAndCapacity();
	//changingVector();
	//pushBack();
	//swapping();
	relationalOperators();
	
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
	
	// Ensure Capacity
	vector<int> vec3 {7, 8, 9}; // cap = 3, size = 3
	cout << str(vec3) << endl;
	
	vec3.reserve(8); // cap = 8, size 3;
	cout << str(vec3) << endl;
	
}

void changingVector(){
	cout << endl << "Initial Vector" << endl;
	vector<int> vec1{1, 2, 3}; // [1, 2, 3] cap = 3, size = 3
	cout << str(vec1) << endl;
	
	cout << endl << "Change element with []" << endl;
	vec1[0] = 10;
	cout << str(vec1) << endl;
	
	cout << endl << "Change element with \"at\" function" << endl;
	vec1.at(1) = 20;
	cout << str(vec1) << endl;
	
	cout << endl << "Change element with \"front\" function" << endl;
	vec1.front() = 100;
	cout << str(vec1) << endl;
	
	vec1.front()++;
	cout << str(vec1) << endl;

	cout << endl << "Change element with \"back\" function" << endl;
	vec1.back() = 30;
	cout << str(vec1) << endl;

	vec1.back() += 7;
	cout << str(vec1) << endl;
	
	cout << endl << "Clearing all elements" << endl;
	vec1.clear();
	cout << str(vec1) << endl;
}

void pushBack(){
	cout << endl << "Add to End of Vector" << endl;
	vector<int> vec1; // [] cap = 0, size = 0
	cout << str(vec1) << endl;       

	cout << endl << "push_back(7)" << endl;
	vec1.push_back(7);
	cout << str(vec1) << endl;       

	cout << endl << "push_back(8)" << endl;
	vec1.push_back(8);
	cout << str(vec1) << endl;       
	
	cout << endl << "push_back(9)" << endl;
	vec1.push_back(9);
	cout << str(vec1) << endl;       

	/* ------- Remove from the end of a vector -------- */
	cout << endl << "pop_back() 1" << endl;
	vec1.pop_back();
	cout << str(vec1) << endl;

	cout << endl << "pop_back() 2" << endl;
	vec1.pop_back();
	cout << str(vec1) << endl;

	cout << endl << "pop_back() 3" << endl;
	vec1.pop_back();
	cout << str(vec1) << endl;
	
}

void swapping(){
	cout << endl << "Swapping two Vectors" << endl;
	vector<int> vec1{1, 2, 3}; // [1, 2, 3] cap = 3, size = 3
	vector<int> vec2{5, 6, 7, 8}; // [5, 6, 7, 8] cap = 4, size = 4
	
	cout << "vec1: " << str(vec1) << endl;
	cout << "vec2: " << str(vec2) << endl;
	
	cout << endl << "swap vectors" << endl;
	// swaps capacity, size, and values
	vec1.swap(vec2);
	cout << "vec1: " << str(vec1) << endl;
	cout << "vec2: " << str(vec2) << endl;
}

void relationalOperators(){
	cout << boolalpha;
	vector<int> vec1{2, 4, 6, 6};
	vector<int> vec2{2, 4, 6, 6, 4};

	cout << "vec1 = " << str(vec1) << endl;
	cout << "vec2 = " << str(vec2) << endl;
	cout << endl;
	
	cout << "vec1 <  vec2 : " << (vec1 <  vec2) << endl;
	cout << "vec1 <= vec2 : " << (vec1 <= vec2) << endl;
	cout << "vec1 == vec2 : " << (vec1 == vec2) << endl;
	cout << "vec1 >= vec2 : " << (vec1 >= vec2) << endl;
	cout << "vec1 >  vec2 : " << (vec1 >  vec2) << endl;
	cout << "vec1 != vec2 : " << (vec1 != vec2) << endl;

}
