// TimeClass1.cpp
// A class representing time of day
// Version 1: Class definition and main() are in the same file

# include <iostream>
# include <sstream>
using namespace std;

class Time {
	
private:
	// Instance Variables
	int hours{};   // 0 - 23
	int minutes{}; // 0 - 59
	int seconds{}; // 0 - 59
	
public:
	// Constructor - Default (no-argument)
	Time() {
		setTime(0, 0, 0);
	}
	
	// Mutators
	void setTime(int newHours, int newMinutes, int newSeconds) {
		setHours(newHours);
		setMinutes(newMinutes);
		setSeconds(newSeconds);
	}
	
	void setHours(int newHours){
		if(0 <= newHours && newHours <= 23){
			hours = newHours;
		}
	}
	
	void setMinutes(int newMinutes){
		if(0 <= newMinutes && newMinutes <= 59){	
			minutes = newMinutes;
		}
	}

	void setSeconds(int newSeconds){
		if(0 <= newSeconds && newSeconds <= 59){
			seconds = newSeconds;
		}
	}
	
	// Accessors
	int getHours(){
		return hours;
	}
	
	int getMinutes(){
		return minutes;
	}
	
	int getSeconds(){
		return seconds;
	}
	
	
	// This is not called automatically like in Java
	string str() {
		stringstream s;
		s.str(""); // make an empty string
		s << hours << ":" << minutes << ":" << seconds;
		return s.str();
	}
	
}; // End of Time Class


int main() {
	Time meetingTime; // Creates a new default Time object
	
	// show what the default constructor does
	cout << "Default time is " << meetingTime.str() << endl;
	
	// Change the time
	meetingTime.setTime(12, 15, 30);
	cout << "New time is " << meetingTime.str() << endl;
	
	return EXIT_SUCCESS;
}