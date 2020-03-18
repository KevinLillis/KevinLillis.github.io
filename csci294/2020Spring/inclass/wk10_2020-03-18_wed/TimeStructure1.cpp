/* TimeStructure1.cpp */

# include <iostream>
using namespace std;

int main(){
	struct Time {
		int hour;   // 0 - 23
		int minute; // 0 - 59
		int second; // 0 - 59
	};
	
	Time meetingTime;
	meetingTime.hour = 10;
	meetingTime.minute = 40;
	meetingTime.second = 12;
	
	cout << "Let's meet at "
	    << meetingTime.hour << ":"
		<< meetingTime.minute << ":"
		<< meetingTime.second
		<< endl;
		
	return EXIT_SUCCESS;
	
}