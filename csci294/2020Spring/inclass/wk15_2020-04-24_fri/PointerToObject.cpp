// File: PointerToObject
# include <iostream>
using namespace std;

/* For simplicity include the class in the same file as main() */

// The class definition
class MyInteger {
private:
    int number;
    
public:
    MyInteger() {
        setNumber(0);
    }

    MyInteger(int initialNumber){
        setNumber(initialNumber);
    }

    void setNumber(int newNumber){
        number = newNumber;
    }

    int getNumber(){
        return number;
    }

}; // End of class definition

// The main program
int main() {
	// Instantiate an object and a pointer to that object
	MyInteger x(8);
	MyInteger *ptr = &x;
	
	// Access the objects members using the variable
	cout << "Using the variable: " << endl
	     << "    x.getNumber() = " << x.getNumber() << endl;
		 
	// Access the object's members using the pointer
	cout << endl;
	ptr->setNumber(5);
	cout << "Using a pointer to the object:" << endl
	     << " ptr->getNumber() = " << ptr->getNumber() << endl;
		 
		 
	// We DO NOT need to release the memory pointed to by ptr before
	// we continue because that memory was not created dynamically.
	// Rather, it was allocated automatically on line 34.
	
	// Dynamically create an instance of the MyInteger class (using the pointer)
	ptr = new MyInteger(15);
	cout << endl;
	cout << "Using a pointer to the object:" << endl
	     << " ptr->getNumber() = " << ptr->getNumber() << endl;


	delete ptr;

    return EXIT_SUCCESS;
}
