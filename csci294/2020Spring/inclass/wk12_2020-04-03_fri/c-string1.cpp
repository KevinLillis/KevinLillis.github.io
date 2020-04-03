// File: c-string1.cpp
# include <iostream>
# include <iomanip>
using namespace std;

int main(){
	char message[] = "All Good Men"; // 12 chars plus a NULL terminator
	
	cout << "message: " << message << endl;
	
	cout << "Each character:" << endl;
	for(int i{0}; i <= 12; i++){
		cout << setw(5) << right << i
		     << setw(5) << right << static_cast<int>(message[i])
			 << "    "
			 << message[i]
			 << endl;
	}
	
	cout << endl;
	cout << "Explicitly print the word 'NULL'" << endl;
		for(int i{0}; i <= 12; i++){
		cout << setw(5) << right << i
		     << setw(5) << right << static_cast<int>(message[i])
			 << "    ";

		if(!message[i]){
			// message[i] is equal to NULL
			cout << "NULL";
		} else {
			cout << message[i];
		}
		
		cout << endl;
	}
	
	cout << "---------------------------------------------------" << endl;
	
	cout << endl << endl;
	message[6] = NULL;
	cout << "message: " << message << endl;
	
		cout << "Each character:" << endl;
	for(int i{0}; i <= 12; i++){
		cout << setw(5) << right << i
		     << setw(5) << right << static_cast<int>(message[i])
			 << "    "
			 << message[i]
			 << endl;
	}
	
	cout << endl;
	cout << "Explicitly print the word 'NULL'" << endl;
		for(int i{0}; i <= 12; i++){
		cout << setw(5) << right << i
		     << setw(5) << right << static_cast<int>(message[i])
			 << "    ";

		if(!message[i]){
			// message[i] is equal to NULL
			cout << "NULL";
		} else {
			cout << message[i];
		}
		
		cout << endl;
	}

	return EXIT_SUCCESS;
}