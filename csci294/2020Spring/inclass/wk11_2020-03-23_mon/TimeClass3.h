// TimeClass3.h
// A class representing time of day
// Version 3: The file containing the class definition and implementation is
// different from the file with the main() function.
// This header file contains the Time class, but not the program that uses the class.

# include <iostream>
# include <sstream>
using namespace std;

// Class definition
class Time {
	
private:
	// Instance Variables
	int hours{};   // 0 - 23
	int minutes{}; // 0 - 59
	int seconds{}; // 0 - 59
	
public:
	// Constructor - Default (no-argument)
	Time();
	
	// Mutators
	void setTime(int newHours, int newMinutes, int newSeconds);
	void setHours(int newHours);
	void setMinutes(int newMinutes);
	void setSeconds(int newSeconds);
	
	// Accessors
	int getHours();
	int getMinutes();
	int getSeconds();
	
	// This is not called automatically like in Java
	string str();
	
}; // End of Time Class Definition


// Class implementation
// Constructor - Default (no-argument)
Time::Time() {
	setTime(0, 0, 0);
}
	
	// Mutators
	void Time::setTime(int newHours, int newMinutes, int newSeconds) {
		setHours(newHours);
		setMinutes(newMinutes);
		setSeconds(newSeconds);
	}
	
	void Time::setHours(int newHours){
		if(0 <= newHours && newHours <= 23){
			hours = newHours;
		}
	}
	
	void Time::setMinutes(int newMinutes){
		if(0 <= newMinutes && newMinutes <= 59){	
			minutes = newMinutes;
		}
	}

	void Time::setSeconds(int newSeconds){
		if(0 <= newSeconds && newSeconds <= 59){
			seconds = newSeconds;
		}
	}
	
	// Accessors
	int Time::getHours(){
		return hours;
	}
	
	int Time::getMinutes(){
		return minutes;
	}
	
	int Time::getSeconds(){
		return seconds;
	}
	
	
	// This is not called automatically like in Java
	string Time::str() {
		stringstream s;
		s.str(""); // make an empty string
		s << hours << ":" << minutes << ":" << seconds;
		return s.str();
	}
	