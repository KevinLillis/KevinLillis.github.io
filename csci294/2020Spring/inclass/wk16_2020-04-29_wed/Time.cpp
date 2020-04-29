// Time.cpp

# include <sstream>
# include "Time.h"
using namespace std;

// Constructor
Time::Time(int newHours, int newMinutes, int newSeconds){
	setTime(newHours, newMinutes, newSeconds);
}

	
// Mutators
void Time::setTime(int newHours, int newMinutes, int newSeconds) {
	setHours(newHours);
	setMinutes(newMinutes);
	setSeconds(newSeconds);
}

int& Time::setHours(int newHours){
	if(0 <= newHours && newHours <= 23){
		hours = newHours;
	} else {
		hours = 0;
	}
	
	return hours;
}

int* Time::setMinutes(int newMinutes){
	if(0 <= newMinutes && newMinutes <= 59){	
		minutes = newMinutes;
	} else {
		minutes = 0;
	}
	
	return &minutes;
}

void Time::setSeconds(int newSeconds){
	if(0 <= newSeconds && newSeconds <= 59){
		seconds = newSeconds;
	} else {
		seconds = 0;
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
	