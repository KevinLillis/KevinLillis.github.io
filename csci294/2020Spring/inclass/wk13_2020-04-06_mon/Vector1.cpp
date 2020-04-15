// File: vector1.cpp
# include <iostream>
# include <sstream>
# include <vector>
using namespace std;

string toString(const vector<int> & vect);

int main(){
	// Default vector
	vector<int> vec1; // has no elements
	vector<int> vec2(6); // has six elements
	
	// print the vectors
	cout << "vec1 = " << toString(vec1) << endl;
	cout << "vec2 = " << toString(vec2) << endl;
	
	// Vectors know their own size
	cout << endl;
	cout << "vec1 size = " << vec1.size() << endl;
	cout << "vec2 size = " << vec2.size() << endl;
	
	// Can use [] as lvalue or rvalue
	cout << endl;
	vec2[0] = 9; // [] as lvalue
	cout << "vec2 = " << toString(vec2) << endl;
	cout << "vec2[0] = " << vec2[0] << endl;  // [] as rvalue
	
	// Can use the function "at" as lvalue or rvalue
	cout << endl;
	vec2.at(1) = 100; // at function as lvalue
	cout << "vec2 = " << toString(vec2) << endl;
	cout << "vec2.at(1) = " << vec2.at(1) << endl;  // at as rvalue
	
	// Compare two vectors with ==
	cout << endl;
	if(vec1 == vec2) {
		cout << "vec1 == vec2" << endl;
	} else {
		cout << "vec1 != vec2" << endl;
	}
	
	// Use asignment operator =
	cout << endl;
	vec1 = vec2;
	cout << "After assignment" << endl;
	if(vec1 == vec2) {
		cout << "vec1 == vec2" << endl;
	} else {
		cout << "vec1 != vec2" << endl;
	}
	
	cout << "vec1 = " << toString(vec1) << endl;
	cout << "vec2 = " << toString(vec2) << endl;
	
	// change just one of the vectors and see they are different
	cout << "Change just vec1" << endl;
	vec1[2] = 88;
	cout << "vec1 = " << toString(vec1) << endl;
	cout << "vec2 = " << toString(vec2) << endl;	
	
	// Use of the "copy constructor"
	cout << endl;
	cout << "Using copy constructor to make vec2 from vec2" << endl;
	vector<int> vec3(vec2);  // vec3 is now a copy of vec2
	cout << "vec2 = " << toString(vec2) << endl;
	cout << "vec3 = " << toString(vec3) << endl;	
	
	// Check if a vector is empty
	cout << endl;
	vector<int> vec4; // defulat constructor
	cout << "vector vec4 empty? " << (vec4.empty() ? "yes" : "no");
	
	return EXIT_SUCCESS;
}

string toString(const vector<int> & vect){
	stringstream s;
	s.str("");
	bool first = true;
	s << "[";
	for(size_t i{0}; i < vect.size(); i++){
		if(first){
			s << vect[i];
			first = false;
		} else {
			s << ", " << vect[i];
		}
	}
	s << "]";
	return s.str();
}
