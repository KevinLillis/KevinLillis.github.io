/* Function1.cpp */
// Demo need for function prototypes

#include <iostream>
using namespace std;

// Function Prototypes
void funA(int);
void funB(int);

int main(){
    funA(5);
}

void funA(int counter){
    if(counter > 0){
        cout << "funA " << counter << endl;
        funB(counter - 1);
    }
}

void funB(int counter) {
    if(counter > 0) {
        cout << "FunB " << counter << endl;
        funA(counter -1);
    }
}

