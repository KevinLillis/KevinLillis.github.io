/* FlipCoin.cpp */

# include <iostream>
# include <cstdlib> // srand(). rand() 0 - RAND_MAX
# include <ctime> // time(using namespace std;
using namespace std;

enum CoinValue{HEADS, TAILS};

CoinValue flip();
void testFlip1();
CoinValue flip(double);
void testFlip2();
void test();


int main(){
	srand(time(0));
	//testFlip1();
	testFlip2();
	
	return EXIT_SUCCESS;
}

void testFlip1(){
	int headsCount{0};
	int tailsCount{0};
	CoinValue coin;
	
	for (int i{0}; i < 10000; i++){
		coin = flip();
		if(coin == HEADS){
			headsCount++;
		} else {
			tailsCount++;
		} 
	}
	
	cout << "Number of heads: " << headsCount << endl;
	cout << "Nunber of tails: " << tailsCount << endl;
} // end testFlip1()

void testFlip2(){
	int headsCount{0};
	int tailsCount{0};
	CoinValue coin;
	
	for (int i{0}; i < 10000; i++){
		coin = flip(.5);
		if(coin == HEADS){
			headsCount++;
		} else {
			tailsCount++;
		} 
	}
	
	cout << "Number of heads: " << headsCount << endl;
	cout << "Nunber of tails: " << tailsCount << endl;
} // end testFlip1()


// 50-50 chance of heads/tails
CoinValue flip(){
	int number = rand() % 2;
	if(number == 0){
		return HEADS;
	} else {
		return TAILS;
	}
	
}

// returns heads with probHeads
// returns tains with 1 - probHeads
// Requirement: 0 <= probHeads <= 1
CoinValue flip(double probHeads){
	int number { rand() }; // number from 0 to RAND_MAX
	
	if (number / static_cast<double>(RAND_MAX) < probHeads){
		return HEADS;
	} else {
		return TAILS;
	}
}
