/* TimeStructure3.cpp */

#include <iostream>
using namespace std;

struct Time {
	int hour;
	int minute;
	int second;
};

struct Person {
	string firstName;
	string lastName;
};

struct Appointment {
	Time meetingTime;
	Person client;
};

void printAppointment(Appointment a);

int main() {
	
	Appointment salesCall;
	salesCall.meetingTime.hour = 8;
	salesCall.meetingTime.minute = 30;
	salesCall.meetingTime.second = 0;
	
	salesCall.client.firstName = "Barney";
	salesCall.client.lastName = "Rubble";
	
	printAppointment(salesCall);
	
	return EXIT_SUCCESS;

}

void printAppointment(Appointment a){
	cout << a.client.firstName << " "
		<< a.client.lastName
		<< endl;
		
	cout << "Meeting at "
		<< a.meetingTime.hour << ":"
		<< a.meetingTime.minute << ":"
		<< a.meetingTime.second
		<< endl;
}