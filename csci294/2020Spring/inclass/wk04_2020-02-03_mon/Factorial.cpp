/* Factorial.cpp */
// A recursive function to computer n!

#include <iostream>
using namespace std;

int fact(int);

int main() {
    cout << fact(3) << endl;
}

// Computer n! using recursion
int fact(int n){
    // check for base case
    if(n <= 1){
        return 1;
    }
    
    return n * fact(n - 1);
}