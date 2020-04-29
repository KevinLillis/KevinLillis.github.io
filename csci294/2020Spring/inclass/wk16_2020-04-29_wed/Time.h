// File: Time.h
#ifndef TIMECLASS_H
#define TIMECLASS_H

class Time {
	
private:
	// Instance Variables
	int hours{};   // 0 - 23
	int minutes{}; // 0 - 59
	int seconds{}; // 0 - 59
	
public:
	// Constructor
	Time(int initHours = 0, int initMinutes = 0, int initSeconds = 0);
	
	// Mutators
	void setTime(int newHours, int newMinutes, int newSeconds);
	int& setHours(int newHours); // Dangerous, don't do this
	int* setMinutes(int newMinutes); // Dangerous, don't do this
	void setSeconds(int newSeconds);
	
	// Accessors
	int getHours();
	int getMinutes();
	int getSeconds();
	
	// This is not called automatically like in Java
	std::string str();
	
}; // End of Time Class Definition
#endif
