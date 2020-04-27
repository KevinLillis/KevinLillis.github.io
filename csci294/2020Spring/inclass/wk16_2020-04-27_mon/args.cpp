// File: args.cpp
# include <iostream>
using namespace std;

int main(int argc, char *argv[]){
	cout << "argc: " << argc << endl;
	cout << endl;
	
	for(int i{0}; i < argc; i++){
		cout << "argv[" << i << "]: "
		     <<  argv[i] << endl;
	}
	
	cout << endl;
	
    return EXIT_SUCCESS;
}