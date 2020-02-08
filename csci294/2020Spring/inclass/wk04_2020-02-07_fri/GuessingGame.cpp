/* Guessing Game */

#include <iostream>
#include <cstdlib> // srand(), rand, RAND_MAX
#include <ctime> // time()
using namespace std;

int main() {
	srand(time(0));
	int number{ rand() % 100 + 1 }; // 1 - 100
	cout << "Hint: the number is " << number << endl;
	int guess{ 0 };
	bool done{ false };
	cout << "I'm thinking of a nuber from 1 to 100." << endl;
	cout << "Can you guess the number?" << endl;

	cout << "Make your first guess: ";
	while (!done) {
		cin >> guess;
		if (guess < number) {
			cout << "Too low. Guess again: ";
		}
		else if (guess > number) {
			cout << "Too high. Guess again:";
		}
		else {
			cout << "Good Job." << endl;
			done = true;
		}
	}

	return EXIT_SUCCESS;
	


}