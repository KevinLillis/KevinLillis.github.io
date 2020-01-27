/* for_CountOddEven.cpp */

// Reads five numbers and shows how many are odd and how many are even.
#include <iostream>
using namespace std;

int main() {
    int number{ 0 }; // This is where we will read numbers into
    int oddCount{ 0 };
    int evenCount{ 0 };
    
    for(int i{ 1 }; i <= 5; i++){
        // Loop body
        cout << i << ") Enter an integer: ";
        cin >> number;
        if(number % 2 == 1){
            oddCount++;
        }
        else {
            evenCount++;
        }
    }
    
    cout << " Number of odds: " << oddCount << "\n"
         << "Number of evens: " << evenCount
         << endl;
        
    return EXIT_SUCCESS;
}