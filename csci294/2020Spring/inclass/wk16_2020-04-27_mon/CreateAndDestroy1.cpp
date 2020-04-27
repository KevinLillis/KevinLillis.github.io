// File: CreateAndDestroy1.cpp
# include <iostream>
using namespace std;

class CreateAndDestroy {
	public:
	CreateAndDestroy(){
		cout << "Constructor called" << endl;
	}
	
	~CreateAndDestroy(){
		cout << "Destructor called" << endl;
	}
}; // End of class definition

int main(int argc, char *argv[]){
	CreateAndDestroy c_and_d;
	cout << endl;
	
	CreateAndDestroy c_and_d2;
	

    return EXIT_SUCCESS;
}