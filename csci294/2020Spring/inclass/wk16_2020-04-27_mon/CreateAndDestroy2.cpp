// File: CreateAndDestroy2.cpp
# include <iostream>
using namespace std;

// Define class

class CreateDestroy {
	private:
		int data;
		
	public:
		CreateDestroy(int value, string message){
			data = value;
			cout << "Object " << data << "   Constructor (" << message << ")" << endl;
		}
		
		~CreateDestroy(){
			cout << "Object " << data << "   Destructor" << endl;
		}
 
};

// Function prototype
void create();

// Create a global
CreateDestroy no1( 1, "Global, created before main");

int main(int argc, char *argv[]){
	CreateDestroy no2( 2, "Local automatic in main");
	static CreateDestroy no3( 3, "Local, static in main");
	
	create();
	create();
	
	CreateDestroy no4( 4, "Local automatic in main");
	CreateDestroy * no5 = new CreateDestroy(5, "Local, dynamic in main");

    return EXIT_SUCCESS;
	
}

// Function to create objects
void create(){
	CreateDestroy no6( 6, "Local, automatic in function");
	static CreateDestroy no7( 7, "Local, static in function");
	CreateDestroy no8( 8, "Local, automatic in function");
	
}