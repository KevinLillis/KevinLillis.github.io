/* cmathFunctions.cpp */

// A look at just a few of the cmath function.
// Note: in VS iostream includes cmath so you have access to all of the cmath
//       functions when you include iostream. This is not normally the case
//       for other compilers.
#include <iostream>
#include <cmath>

using namespace std;
int main() {
    cout << "Log base 2 of 17, double: log2(17) = " << log2(17) << endl;
    cout << "Log base 2 of 17, int: logb(17) = " << logb(17) << endl;
    cout << "3^4 = " << pow(3, 4) << endl;
    cout << "sqrt(81) = " << sqrt(81) << endl;
    cout << "sqrt(3^2 + 9^2) = hypot(3, 9) => "
         << sqrt(9 + 81) << " = " << hypot(3, 9) << endl;
    cout << "ceiling: ceil(1.002) = " << ceil(1.002) << endl;
    cout << "floor: floor(3.999) = " << floor(3.999) << endl;
         
}