/* Guessing Game */

#include <iostream>
#include <cstdlib> // srand(), rand, RAND_MAX
#include <ctime> // time()
#include <string>
using namespace std;

// Function Declarations

/*
	Displays the given prompt, which should include instructions to enter a 
	number from 1 to 100. Reads a number from the keyboard. Performs input
	validation to ensure a number from 1 to 100 is entered. Returns the number
	once it has been entered.
*/
int getGuess(string prompt);


/*
	Given the number of tries it took to guess the secrete number, returns
	one of the following rankings:
		1 -  2 Guesses: Lucky
		3 -  4 Guesses: Excellent
		5 -  7 Guesses: Good
		7 -  8 Guesses: Average
		9 - 10 Guesses: Poor
		  > 10 Guesses: Pathetic
*/
string getRank(int guessCount);

/*
	Displays the given prompt, which should include instructions to enter  
	to enter 1 to play again or 2 to quit and reads a number from the keyboard.
	Performs input validation to ensure only 1 or 2 is entered. Returns the
	Returns true or false based on the number entered.
*/
bool getPlayAgain(string prompt);

/*
	Plays one round of the Guessing Game. See the homework instructions
	for details.
*/
void playOneGame();

/*
	Plays multiple rounds fo the Guessing Game until the user decides to quit.
*/
int main() {
	srand(time(0));
	
	bool playAgain = true;
	while(playAgain){
		playOneGame();
		playAgain = getPlayAgain("\nPlay again 1) for Yes   2) for No: ");
	}
	
	cout << endl;
	cout << "Thank you playing." << endl;
	cout << "In Case I Don't See Ya, "
		<< "Good Afternoon, Good Evening And Goodnight."
		<< endl;
	
	return EXIT_SUCCESS;
}

void playOneGame() {
	cout << "\n-------------------------------------------" << endl;
	cout << "I'm thinking of a number. Can you guess it?" << endl;
	int secretNumber{ rand() % 100 + 1 }; // 1 - 100
	cout << "Hint: the number is " << secretNumber << endl;
	int guessCount{ 0 };
	int guess{};
	guess = getGuess("Enter first guess: ");
	guessCount++;
	bool done{guess == secretNumber};
	string prompt;
	
	while(!done){
		if(guess < secretNumber){
			prompt = "Too low. Guess again: ";		
		} else {
			prompt = "Too high. Guess again: ";
		}
		
		guess = getGuess(prompt);
		guessCount++;
		done = guess == secretNumber;
	}
	
	cout << "You guessed the number in " << guessCount 
		<< " guess" << (guessCount == 1 ? "" : "es") << "." << endl;
	cout << "You are " << getRank(guessCount) << "." << endl;

	
}

int getGuess(string prompt){
	int guess{};
	bool validGuess = { false };
	while(!validGuess){
		cout << prompt;
		cin >> guess;
		if(1 <= guess && guess <= 100){
			validGuess = true;
		} else {
			prompt = "Invalid guess. Enter a number from 1 to 100: ";
		}
	}	
	return guess;
}

string getRank(int guessCount){
	if(guessCount <= 3){
		return "Lucky";
	}
	else if(guessCount <= 6){
		return "Awesome";
	}
	else if (guessCount <= 9){
		return "Good";
	}
	else if (guessCount <= 12){
		return "Meh";
	}
	else if (guessCount <= 15){
		return "Poor";
	}
	else {
		return "Pathetic";
	}
}

bool getPlayAgain(string prompt){
	bool validInput{false};
	int entry{};
	while(!validInput){
		cout << prompt;
		cin >> entry;
		// The first if checks if a non-number key was pressed
		if(cin.fail()){
			cin.clear();
			cin.ignore(numeric_limits<streamsize>::max(),'\n');
			prompt = "Invalid entry. Enter 1 to Play Again or 2 to Quit: ";
			
		}
		else if (entry == 1 || entry == 2){
			validInput = true;
		} else {
			prompt = "Invalid entry. Enter 1 to Play Again or 2 to Quit: ";
		}
	}
	
	return entry == 1;
}

