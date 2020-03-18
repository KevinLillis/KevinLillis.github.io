/* TimeStructure2.cpp */

# include <iostream>
using namespace std;

struct Time {
	int hour;   // 0 - 23
	int minute; // 0 - 59
	int second; // 0 - 59
};

void printTime(Time t);

int main(){
	Time meetingTime;
	meetingTime.hour = 10;
	meetingTime.minute = 22;
	meetingTime.second = 12;
	
	printTime(meetingTime);
		
	return EXIT_SUCCESS;
}

void printTime(Time t){
	cout << "Let's meet at "
	    << t.hour << ":"
		<< t.minute << ":"
		<< t.second
		<< endl;
}		