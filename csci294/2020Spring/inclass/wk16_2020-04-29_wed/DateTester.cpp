// File: DateTester.cpp
# include <iostream>
# include "Date.h"
using namespace std;

int main(){
    // Create and display a Date object
    Date bday(4,9,1987);

    cout << "bday = " << bday.str() << endl;

    // Create a new Date object and use the assignment operator (=)
    // Assignment operator makes a shallow copy
    Date day1 = bday;

    cout << "day1 = " << day1.str() << endl;


    // Show these objects are different
    cout << endl;
    cout << "These are NOT the same object" << endl;
    cout << "Memory location of bday: " << &bday << endl;
    cout << "Memory location of day1: " << &day1 << endl;

    return EXIT_SUCCESS;
}
