/* Strings1.cpp */
#include <iostream>

using namespace std;

// Function Declarations
string getMessage(int);
int getNumber(string prompt);


int main() {
    string message{"Enter a Number: "};
    string result("");
    int x {0};
    
    x = getNumber(message);
    result = getMessage(x);
    cout << x << " is " << result << endl;
}


int getNumber(string prompt){
    int number{0};
    cout << prompt;
    cin >> number;
    return number;
}

string getMessage(int x){
    if (x < 0){
        return "negative";
    }
    else if (x > 0) {
        return "positive";
    }
    else {
        return "zero";
    }
}