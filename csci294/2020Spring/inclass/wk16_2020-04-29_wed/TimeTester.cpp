// File: TimeTester.cpp
# include <iostream>
# include "Time.h"
using namespace std;

int main(){
    // Create a time object
    Time t(10,10,10);
    cout << "Initial time: " << t.str() << endl;
    cout << endl;


    // Get a reference to a private data membber
    int& h = t.setHours(11); 
    cout << "Hour is valid: " << t.str() << endl;

    // Get a pointer to a private data member
    int* m = t.setMinutes(11);
    cout << "Minute is valid: " << t.str() << endl;
    cout << endl;
    

    // Access private data with the reference
    h = 100;
    cout << "Hour is now invalid: " << t.str() << endl;

    // Access private data with the pointer
    *m = 100;
    cout << "Minute is now invalid: " << t.str() << endl;
    cout << endl;
    
    
    // Access private using function call
    t.setHours(7) = 200;
    cout << "Hour is invalid again: " << t.str() << endl;

    // Do it with the pointer too
    *(t.setMinutes(33)) = 200;
    cout << "Minute is invalid again: " << t.str() << endl;

    return EXIT_SUCCESS;
}

