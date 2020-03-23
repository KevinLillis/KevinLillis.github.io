// TimeClass4.h
// A class representing time of day
// Version 4: The class definition and the class implementation are in 
// separate files. This CPP file has the class implementation.
# include <sstream>
# include "TimeClass4.h"
using namespace std;

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
