// File TestScores.cpp

# include <iostream>
# include <fstream>

using namespace std;

const int A{0}, B{1}, C{2}, D{3}, F{4}; // Used for array indexes
const char letters[5] = {'A', 'B', 'C', 'D', 'F'};

int main(){
    // Declare variables 
    ifstream inFile; // For reading from the file
    int score{}; // Will read each score into this variable
    int count{0}; // Total number of scores

    int frequency[5] = {}; // Will count A, B, C, D, F grades
    int numStars[5] = {}; // For the Bar Chart

	// Open input file
	inFile.open("scores.dat");
    if(!inFile){
        cerr << "Cannot open file \"scores.dat\"" << endl;
        return EXIT_FAILURE;
    }

    // Read scores from input file & then close input file
	inFile >> score; // read first value (priming read)
	while(inFile){
		count++;
		
		if(score >= 90){
			frequency[A]++;
		} else if (score >= 80){
			frequency[B]++;
		} else if (score >= 70){
			frequency[C]++;
		} else if (score >= 60) {
			frequency[D]++;
		} else {
			frequency[F]++;
		}
		
		inFile >> score;
	}
	
	inFile.close();

	/*** Print Results ***/
    // Print total number of test scores
	cout << "Total number of test scores processed: " << count
	     << endl << endl;
    
	// Print Grade Distribution
	cout << "Grade Distribution" << endl;
	for(int grade{A}; grade <= F; grade++){
		double gradePercent{static_cast<double>(frequency[grade])/count*100};
		
		cout << letters[grade] << ":\t" << frequency[grade] << "\t" 
		     << gradePercent << " %" << endl;
			 
		numStars[grade] = gradePercent;
	}
    
	// Print Bar Chart
	cout << endl << endl;
	cout << "Bar Chart" << endl;
	for(int grade{A}; grade <= F; grade++){
		cout << letters[grade] << ": ";
		
		for(int i{0}; i < numStars[grade]; i++){
			cout << "*";
		}
		cout << endl;
	}

	return EXIT_SUCCESS;
}
