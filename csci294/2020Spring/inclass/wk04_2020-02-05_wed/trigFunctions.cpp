/* trigFunctions.cpp */

#define _USE_MATH_DEFINES
#include <iostream>
#include <cmath>

using namespace std;

void testDegRad();
double rad2deg(double);
double deg2rad(double);

void testTrigFunctions();

int main() {
    testDegRad();
    //testTrigFunctions();
}

void testDegRad(){
    double degrees{0.0};
    double radians{0.0};
    
    cout << "Enter degrees: ";
    cin >> degrees;
    radians = deg2rad(degrees);
    cout << degrees << " degrees = " << radians << " radians" << endl;
    
    cout << "Enter radians: ";
    cin >> radians;
    degrees = rad2deg(radians);
    cout << radians << " radians = " << degrees << " degrees" << endl;
}

double rad2deg(double rad){
    double deg{rad * 180/M_PI};
    return deg;
}

double deg2rad(double deg){
    double rad{deg * M_PI/180};
    return rad;
}

void testTrigFunctions(){
    cout << "sin(180 deg) = " << sin(deg2rad(180)) << " // should be zero" << endl;
    cout << "sin(pi rad) = " << sin(M_PI) << " // should be zero" << endl;
    
    cout << "acos(0.838670568) in degrees = " 
         << rad2deg(acos(0.838670568)) 
         << " // should be 33" << endl; 

         cout << "acos(0.838670568) in radians = " 
                << acos(0.838670568) 
                << " // should be 0.575959" << endl; 

}