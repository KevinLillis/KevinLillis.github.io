// TimeClass4.h
// A class representing time of day
// Version 4: The class definition and the class implementation are in 
// separate files. This header file just has the class definition.

//using namespace std;

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
	std::string str();
	
}; // End of Time Class Definition
