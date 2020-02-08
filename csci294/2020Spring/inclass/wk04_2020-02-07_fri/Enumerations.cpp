/* Enumerations */
#include<iostream>
using namespace std;

int main() {
	enum CoinValue { HEADS, TAILS };

	CoinValue coin{ HEADS };

	coin = TAILS;
 	if (coin == HEADS) {
		cout << "Coin value is HEADS" << endl;
		cout << coin;
	} 

	if (coin == TAILS) {
		cout << "Coin values is TAILS" << endl;
	}

	return EXIT_SUCCESS;
}