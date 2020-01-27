/* ConditionalExpression.cpp */

#include <iostream>
using namespace std;

int main() {
    int x{ 0 };
    int y{ 0 };
    
    cout << "Enter x: ";
    cin >> x;
    
    cout << "Enter y: ";
    cin >> y;
    
    // use conditional expression as an initial value
    int larger { x > y ? x : y};
    cout << "Larger is " << larger << endl;
    
    // use conditional expression in an assignment statement
    int smaller{ 0 };
    smaller = { x < y ? x : y};
    cout << "Smaller is " << smaller << endl;
    
    // use cconditional expression directly in the output
    cout << "Larger is " << (x > y ? x : y) << endl;
    
}