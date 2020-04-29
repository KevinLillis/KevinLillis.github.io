// File: RectangleTester.cpp
# include <iostream>
# include "Rectangle.h"
using namespace std;

void compareRectangles(const Rectangle &, const Rectangle &);

int main() {
    // Constructors
    cout << "Constructors" << endl;
    Rectangle r1;      // h=1  w=1
    Rectangle r2(3,2); // h=3  w=2
    Rectangle r3 = r2; // h=3  w=2
    Rectangle r4(r1);  // h=1  w=1

    // Extraction Operator
    cout << "Expected: 1 1  :  r1 = " << r1 << endl
         << "Expected: 3 2  :  r2 = " << r2 << endl
         << "Expected: 3 2  :  r3 = " << r3 << endl 
         << "Expected: 1 1  :  r4 = " << r4 << endl;

    // Insertion Stream
//    cout << endl;
//    cout << "Insertion Stream" << endl;
//    Rectangle r5; 
//    
//    cout << "Enter a height AND a width: ";
//    cin >> r5;
//    
//    cout << "The rectangle has Height and Width equal to " 
//        << r5 << endl;

    // Call Overload Function Manually
    cout << endl;
    cout << "Call Overloaded Function Manually" << endl;
    cout << "Expected: true  :  " 
        << ( r1.operator<(r2) ? "true" : "false" ) << endl;

    // Assignment Operator
    cout << endl << "Assignment Operator" << endl;
    Rectangle r6, r7;
    r6 = r7 = r2;
    cout << "Expected: 3 2  :  r6 = " << r6 << endl;
    cout << "Expected: 3 2  :  r7 = " << r7 << endl;
    cout << "Expected: 3 2  :  r2 = " << r2 << endl;

    // Compount Assignment Operators
    cout << endl << "Compound Assignment Operators" << endl;
    r4;       // h=1  w=1
    r4 += r3; // h=4  w=3
    cout << "Expected: 4 3  :  r4 = " << r4 << endl;

    r4 *= r3; // h=12  w=6
    cout << "Expected: 12 6  :  r4 = " << r4 << endl;

    r4 -= r3; // h=9  w=4
    cout << "Expected: 9 4  :  r4 = " << r4 << endl;

    r4 /= r3; // h=3  w=2
    cout << "Expected: 3 2  :  r4 = " << r4 << endl;


    // Binary Arithmetic Operators
    cout << endl << "Binary Arithmetic Operators" << endl;
    r4 = r1 + r2; // h=4  w=3
    cout << "Expected: 4 3  :  r4 = " << r4 << endl;

    r4 = r2 - r1; // h=2  w=1
    cout << "Expected: 2 1  :  r4 = " << r4 << endl;

    r4 = r2 * r3; // h=9  w=4
    cout << "Expected: 9 4  :  r4 = " << r4 << endl;

    r4 = r3 / r2; // h=1  w=1
    cout << "Expected: 1 1  :  r4 = " << r4 << endl;


    // Unary Operators pre-increment and pre-decrement
    cout << endl << "pre-increment and pre-decrement" 
        << endl;
    r4 = r3; // h=3  w=2
    ++r4; //h=4  w=3
    cout << "Expected: 4 3  :  r4 = " << r4 << endl;
    
    r5 = ++r4; // h=5  w=4
    cout << "Expected: 5 4  :  r4 = " << r4 << endl;
    cout << "Expected: 5 4  :  r5 = " << r5 << endl;

    --r4; //h=4  w=3
    cout << "Expected: 4 3  :  r4 = " << r4 << endl;

    r5 = --r4; // h=3  w=2
    cout << "Expected: 3 2  :  r5 = " << r5 << endl;
    cout << "Expected: 3 2  :  r4 = " << r4 << endl;


    // Unary Operators, post-increment and post-decrement
    cout << endl << "post-increment and post-decrement" 
        << endl;
    r4 = r3; // h=3  w=2
    r4++; //h=4  w=3
    cout << "Expected: 4 3  :  r4 = " << r4 << endl;
    
    r5 = r4++; // r5: h=4  w=3,  r4: h=5  w=4
    cout << "Expected: 5 4  :  r4 = " << r4 << endl;
    cout << "Expected: 4 3  :  r5 = " << r5 << endl;

    r4--; //h=4  w=3
    cout << "Expected: 4 3  :  r4 = " << r4 << endl;

    r5 = r4--; // r5: h=4  w=3  r4: h=3  w=2
    cout << "Expected: 4 3  :  r5 = " << r5 << endl;
    cout << "Expected: 3 2  :  r4 = " << r4 << endl;


    // Unary Minus and Unary Plus
    cout << endl << "Unary Minus and Unary Plus" << endl;
    r4 = -r3; // h=-3  w=-2
    cout << "Expected: -3 -2  :  r4 = " << r4 << endl;

    r4 = +r3;  // h=3  w=2
    cout << "Expected: 3 2  :  r4 = " << r4 << endl;

    // Binary Relational Operators
    cout << endl << "Binary Relational Operators" << endl;
    compareRectangles(r1, r2);
    cout << endl;
    compareRectangles(r2, r1);
    cout << endl;
    compareRectangles(r2, r3);

    return EXIT_SUCCESS;
}

void compareRectangles(const Rectangle & rectA, const Rectangle & rectB){
    if(rectA < rectB)
        cout << rectA.area() << " < " << rectB.area() << endl;

    if(rectA <= rectB)
        cout << rectA.area() << " <= " << rectB.area() << endl;

    if(rectA == rectB)
        cout << rectA.area() << " == " << rectB.area() << endl;

    if(rectA >= rectB)
        cout << rectA.area() << " >= " << rectB.area() << endl;

    if(rectA > rectB)
        cout << rectA.area() << " > " << rectB.area() << endl;

    if(rectA != rectB)
        cout << rectA.area() << " != " << rectB.area() << endl;
}